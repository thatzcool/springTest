package com.multicampus.srpingex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("maria")
public class SampleDAOO_Mariadb_Impl implements SampleDAO{

}
