SELECT bc.noOfCopies FROM tbl_book book, tbl_book_copies bc, tbl_library_branch lb WHERE book.bookId = bc.bookId AND book.title='The Lost Tribe' AND lb.branchName='Sharpstown';

SELECT noOfCopies FROM tbl_book, tbl_book_copies WHERE title='The Lost Tribe' GROUP BY branchId;

SELECT name FROM tbl_borrower WHERE cardNo NOT IN(SELECT cardNo FROM tbl_book_loans);

SELECT book.title, borr.name, borr.address
	FROM tbl_book book, tbl_borrower borr, tbl_book_loans loan, tbl_library_branch lb
	WHERE lb.branchName = 'Sharpstown' AND lb.branchId = loan.branchId AND loan.dueDate= DATE(NOW()) AND loan.cardNo=borr.cardNo AND loan.bookId=book.bookId;
    
SELECT lb.branchName, COUNT(*) from tbl_library_branch lb, tbl_book_loans loan WHERE lb.branchId = loan.branchId GROUP BY lb.branchName;

SELECT borr.name, borr.address, COUNT(*) FROM tbl_borrower borr, tbl_book_loans loan
	WHERE borr.cardNo = loan.cardNo GROUP BY borr.cardNo, borr.name, borr.address HAVING COUNT(*) > 5;
    
SELECT title, noOfCopies FROM 
	(((tbl_author NATURAL JOIN tbl_book) NATURAL JOIN tbl_book_copies) NATURAL JOIN tbl_library_branch)
    WHERE authorName = 'Stephen King' AND branchName = 'Central';