-- MySQL Script generated by MySQL Workbench
-- 06/14/17 14:40:03
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Project_development_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Project_development_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Project_development_db` DEFAULT CHARACTER SET utf8 ;
USE `Project_development_db` ;

-- -----------------------------------------------------
-- Table `Project_development_db`.`developers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`developers` (
  `id_developer` INT NOT NULL,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `work_experience_months` INT NOT NULL,
  `salary` INT NOT NULL,
  PRIMARY KEY (`id_developer`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Project_development_db`.`skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`skills` (
  `id_skill` INT NOT NULL,
  `programming_languages` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_skill`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Project_development_db`.`projects`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`projects` (
  `id_project` INT NOT NULL,
  `name_project` VARCHAR(45) NOT NULL,
  `cost` INT NOT NULL,
  PRIMARY KEY (`id_project`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Project_development_db`.`companies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`companies` (
  `id_companie` INT NOT NULL,
  `name_companie` VARCHAR(45) NOT NULL,
  `number_of_employees` INT NOT NULL,
  PRIMARY KEY (`id_companie`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Project_development_db`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`customers` (
  `id_customer` INT NOT NULL,
  `name_customer` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_customer`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Project_development_db`.`developers_have_projects`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`developers_have_projects` (
  `id_developer` INT NOT NULL,
  `id_project` INT NOT NULL,
  PRIMARY KEY (`id_developer`, `id_project`),
  INDEX `FK_id_project_idx` (`id_project` ASC),
  CONSTRAINT `FK_id_developer_project`
    FOREIGN KEY (`id_developer`)
    REFERENCES `Project_development_db`.`developers` (`id_developer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_id_project_dev`
    FOREIGN KEY (`id_project`)
    REFERENCES `Project_development_db`.`projects` (`id_project`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Project_development_db`.`developers_in_companies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`developers_in_companies` (
  `id_developer` INT NOT NULL,
  `id_companie` INT NOT NULL,
  PRIMARY KEY (`id_developer`, `id_companie`),
  INDEX `FK_id_companie_idx` (`id_companie` ASC),
  CONSTRAINT `FK_id_developer_in_companie`
    FOREIGN KEY (`id_developer`)
    REFERENCES `Project_development_db`.`developers` (`id_developer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_id_companie`
    FOREIGN KEY (`id_companie`)
    REFERENCES `Project_development_db`.`companies` (`id_companie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Project_development_db`.`customers_have_projects_in_companies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`customers_have_projects_in_companies` (
  `id_customer` INT NOT NULL,
  `id_companie` INT NOT NULL,
  `id_project` INT NOT NULL,
  PRIMARY KEY (`id_customer`, `id_companie`, `id_project`),
  INDEX `FK_id_companie_idx` (`id_companie` ASC),
  INDEX `FK_id_project_idx` (`id_project` ASC),
  CONSTRAINT `FK_id_customer_project`
    FOREIGN KEY (`id_customer`)
    REFERENCES `Project_development_db`.`customers` (`id_customer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_id_companie_project`
    FOREIGN KEY (`id_companie`)
    REFERENCES `Project_development_db`.`companies` (`id_companie`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_id_project_cus`
    FOREIGN KEY (`id_project`)
    REFERENCES `Project_development_db`.`projects` (`id_project`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Project_development_db`.`developers_have_skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Project_development_db`.`developers_have_skills` (
  `id_developer` INT NOT NULL,
  `id_skill` INT NOT NULL,
  PRIMARY KEY (`id_developer`, `id_skill`),
  INDEX `FK_id_skill_idx` (`id_skill` ASC),
  CONSTRAINT `FK_id_developer_skill`
    FOREIGN KEY (`id_developer`)
    REFERENCES `Project_development_db`.`developers` (`id_developer`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_id_skill`
    FOREIGN KEY (`id_skill`)
    REFERENCES `Project_development_db`.`skills` (`id_skill`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
