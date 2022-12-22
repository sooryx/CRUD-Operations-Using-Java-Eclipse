CREATE TABLE `stud_details` (
  `stud_id` int(11) NOT NULL auto_increment,
  `stud_name` varchar(60) NOT NULL,
  `email` varchar(45) NOT NULL,
  `fees` double default NULL,
  `date_of_birth` datetime default NULL,
  `semester` decimal(10,0) default NULL,
  PRIMARY KEY  (`stud_id`)
) ;