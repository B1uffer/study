create table inquery(  /* inquery 테이블 생성 */
	num int not null auto_increment, /* num필드 생성, 숫자형, 빈값 허용 불가능, 레코드가 추가되면 1 2 3 순으로 자동 생성 */
	name text not null,
	phone text not null,
	shop text not null,
	content text not null, /* comment 필드 생성, 문자형, 빈값 허용 불가능 */
	primary key(num) /* 기본키 지정 (식별자 필드) */
);