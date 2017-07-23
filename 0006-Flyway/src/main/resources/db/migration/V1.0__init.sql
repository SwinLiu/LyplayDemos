
-- Delete table sflow_company for PO Company 
Drop table  IF EXISTS sflow_company ;

-- Create table sflow_company for PO Company 
CREATE TABLE sflow_company ( 
	id	varchar(20) ,
	name	varchar(120) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_company 
ALTER TABLE sflow_company ADD CONSTRAINT pk_sflow_company PRIMARY KEY (id); 


-- Delete table sflow_org_rule for PO OrgRule 
Drop table  IF EXISTS sflow_org_rule ;

-- Create table sflow_org_rule for PO OrgRule 
CREATE TABLE sflow_org_rule ( 
	id	varchar(20) ,
	org_id	varchar(20) NOT NULL ,
	manager_type	varchar(20) NOT NULL ,
	manager_org	varchar(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_org_rule 
ALTER TABLE sflow_org_rule ADD CONSTRAINT pk_sflow_org_rule PRIMARY KEY (id); 


-- Delete table sflow_org_type_rule for PO OrgTypeRule 
Drop table  IF EXISTS sflow_org_type_rule ;

-- Create table sflow_org_type_rule for PO OrgTypeRule 
CREATE TABLE sflow_org_type_rule ( 
	id	varchar(20) ,
	pid	varchar(20) NOT NULL ,
	cid	varchar(20) NOT NULL ,
	num	int(4) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_org_type_rule 
ALTER TABLE sflow_org_type_rule ADD CONSTRAINT pk_sflow_org_type_rule PRIMARY KEY (id); 


-- Delete table sflow_org_type for PO OrgType 
Drop table  IF EXISTS sflow_org_type ;

-- Create table sflow_org_type for PO OrgType 
CREATE TABLE sflow_org_type ( 
	id	varchar(20) ,
	name	varchar(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_org_type 
ALTER TABLE sflow_org_type ADD CONSTRAINT pk_sflow_org_type PRIMARY KEY (id); 


-- Delete table sflow_org for PO Organization 
Drop table  IF EXISTS sflow_org ;

-- Create table sflow_org for PO Organization 
CREATE TABLE sflow_org ( 
	id	varchar(20) ,
	name	varchar(50) NOT NULL ,
	type_id	varchar(20) NOT NULL ,
	order_num	int(4) NOT NULL ,
	parent_id	varchar(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_org 
ALTER TABLE sflow_org ADD CONSTRAINT pk_sflow_org PRIMARY KEY (id); 


-- Delete table sflow_user_org_pos for PO UserOrgPosition 
Drop table  IF EXISTS sflow_user_org_pos ;

-- Create table sflow_user_org_pos for PO UserOrgPosition 
CREATE TABLE sflow_user_org_pos ( 
	id	varchar(20) ,
	user_id	varchar(20) NOT NULL ,
	org_id	varchar(20) NOT NULL ,
	pos_id	varchar(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_user_org_pos 
ALTER TABLE sflow_user_org_pos ADD CONSTRAINT pk_sflow_user_org_pos PRIMARY KEY (id); 


-- Delete table sflow_position for PO Position 
Drop table  IF EXISTS sflow_position ;

-- Create table sflow_position for PO Position 
CREATE TABLE sflow_position ( 
	id	varchar(20) ,
	name	varchar(50) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_position 
ALTER TABLE sflow_position ADD CONSTRAINT pk_sflow_position PRIMARY KEY (id); 


-- Delete table sflow_user_login_logs for PO UserLoginLogs 
Drop table  IF EXISTS sflow_user_login_logs ;

-- Create table sflow_user_login_logs for PO UserLoginLogs 
CREATE TABLE sflow_user_login_logs ( 
	id	varchar(20) ,
	user_id	varchar(20) NOT NULL ,
	login_ip	varchar(20) NOT NULL ,
	login_time	datetime NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_user_login_logs 
ALTER TABLE sflow_user_login_logs ADD CONSTRAINT pk_sflow_user_login_logs PRIMARY KEY (id); 


-- Delete table sflow_user_account for PO UserAccount 
Drop table  IF EXISTS sflow_user_account ;

-- Create table sflow_user_account for PO UserAccount 
CREATE TABLE sflow_user_account ( 
	id	varchar(20) ,
	user_name	varchar(20) NOT NULL ,
	email	varchar(20) NOT NULL ,
	phone	varchar(20) ,
	status	int(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_user_account 
ALTER TABLE sflow_user_account ADD CONSTRAINT pk_sflow_user_account PRIMARY KEY (id); 


-- Delete table sflow_sequence for PO Sequence 
Drop table  IF EXISTS sflow_sequence ;

-- Create table sflow_sequence for PO Sequence 
CREATE TABLE sflow_sequence ( 
	sequence_name	varchar(20) ,
	prefix	varchar(20) ,
	curr_value	varchar(20) NOT NULL ,
	suffix	varchar(20) ,
	lpad_length	int(3) NOT NULL ,
	increment	int(3) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_sequence 
ALTER TABLE sflow_sequence ADD CONSTRAINT pk_sflow_sequence PRIMARY KEY (sequence_name); 


-- Delete table sflow_user_password for PO UserPassword 
Drop table  IF EXISTS sflow_user_password ;

-- Create table sflow_user_password for PO UserPassword 
CREATE TABLE sflow_user_password ( 
	id	varchar(20) ,
	password	varchar(50) NOT NULL ,
	status	int(2) NOT NULL ,
	lock_time	datetime 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_user_password 
ALTER TABLE sflow_user_password ADD CONSTRAINT pk_sflow_user_password PRIMARY KEY (id); 


-- Delete table sflow_user for PO User 
Drop table  IF EXISTS sflow_user ;

-- Create table sflow_user for PO User 
CREATE TABLE sflow_user ( 
	id	varchar(20) ,
	name	varchar(40) NOT NULL ,
	sex	int(1) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_user 
ALTER TABLE sflow_user ADD CONSTRAINT pk_sflow_user PRIMARY KEY (id); 


-- Delete table sflow_controller_opr for PO ControllerOperation 
Drop table  IF EXISTS sflow_controller_opr ;

-- Create table sflow_controller_opr for PO ControllerOperation 
CREATE TABLE sflow_controller_opr ( 
	id	varchar(20) ,
	name	varchar(50) ,
	method_name	varchar(50) NOT NULL ,
	index_pos	int(5) ,
	res_id	varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_controller_opr 
ALTER TABLE sflow_controller_opr ADD CONSTRAINT pk_sflow_controller_opr PRIMARY KEY (id); 


-- Delete table sflow_menu_res for PO MenuResource 
Drop table  IF EXISTS sflow_menu_res ;

-- Create table sflow_menu_res for PO MenuResource 
CREATE TABLE sflow_menu_res ( 
	id	varchar(20) ,
	name	varchar(50) ,
	menu_pos	varchar(20) ,
	href	varchar(50) ,
	icon	varchar(50) ,
	order_num	int(5) ,
	dispaly	int(2) ,
	parent_id	varchar(20) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_menu_res 
ALTER TABLE sflow_menu_res ADD CONSTRAINT pk_sflow_menu_res PRIMARY KEY (id); 


-- Delete table sflow_controller_res for PO ControllerResource 
Drop table  IF EXISTS sflow_controller_res ;

-- Create table sflow_controller_res for PO ControllerResource 
CREATE TABLE sflow_controller_res ( 
	id	varchar(20) ,
	name	varchar(50) ,
	class_name	varchar(50) NOT NULL ,
	order_num	int(5) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_controller_res 
ALTER TABLE sflow_controller_res ADD CONSTRAINT pk_sflow_controller_res PRIMARY KEY (id); 


-- Delete table sflow_user_access_group for PO UserAccessGroup 
Drop table  IF EXISTS sflow_user_access_group ;

-- Create table sflow_user_access_group for PO UserAccessGroup 
CREATE TABLE sflow_user_access_group ( 
	id	varchar(20) ,
	user_id	varchar(20) NOT NULL ,
	access_grp_id	varchar(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_user_access_group 
ALTER TABLE sflow_user_access_group ADD CONSTRAINT pk_sflow_user_access_group PRIMARY KEY (id); 


-- Delete table sflow_role for PO Role 
Drop table  IF EXISTS sflow_role ;

-- Create table sflow_role for PO Role 
CREATE TABLE sflow_role ( 
	id	varchar(20) ,
	role_name	varchar(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_role 
ALTER TABLE sflow_role ADD CONSTRAINT pk_sflow_role PRIMARY KEY (id); 


-- Delete table sflow_role_access_group for PO RoleAccessGroup 
Drop table  IF EXISTS sflow_role_access_group ;

-- Create table sflow_role_access_group for PO RoleAccessGroup 
CREATE TABLE sflow_role_access_group ( 
	id	varchar(20) ,
	role_id	varchar(20) NOT NULL ,
	access_grp_id	varchar(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_role_access_group 
ALTER TABLE sflow_role_access_group ADD CONSTRAINT pk_sflow_role_access_group PRIMARY KEY (id); 


-- Delete table sflow_access_group for PO AccessGroup 
Drop table  IF EXISTS sflow_access_group ;

-- Create table sflow_access_group for PO AccessGroup 
CREATE TABLE sflow_access_group ( 
	id	varchar(20) ,
	group_name	varchar(20) NOT NULL ,
	order_num	int(3) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_access_group 
ALTER TABLE sflow_access_group ADD CONSTRAINT pk_sflow_access_group PRIMARY KEY (id); 


-- Delete table sflow_user_role for PO UserRole 
Drop table  IF EXISTS sflow_user_role ;

-- Create table sflow_user_role for PO UserRole 
CREATE TABLE sflow_user_role ( 
	id	varchar(20) ,
	user_id	varchar(20) NOT NULL ,
	comp_id	varchar(20) NOT NULL ,
	role_id	varchar(20) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_user_role 
ALTER TABLE sflow_user_role ADD CONSTRAINT pk_sflow_user_role PRIMARY KEY (id); 


-- Delete table sflow_acl for PO ACL 
Drop table  IF EXISTS sflow_acl ;

-- Create table sflow_acl for PO ACL 
CREATE TABLE sflow_acl ( 
	id	varchar(20) ,
	ptype	varchar(20) ,
	pid	varchar(20) ,
	rtype	varchar(20) ,
	rid	varchar(20) ,
	acl_state	int(4) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Create Primary Key for Table sflow_acl 
ALTER TABLE sflow_acl ADD CONSTRAINT pk_sflow_acl PRIMARY KEY (id); 
