create database demoGit
drop database demoGit
create table SanPham(
	MaSanPham varchar(15) primary key,
	Ten nvarchar(30),
	GhiChu nvarchar(30),
	NgayTao date,
	TrangThai bit
)
insert into SanPham values ('SP1','Túi sách','Túi luôn vui tươi',getdate(),0)
select * from SanPham