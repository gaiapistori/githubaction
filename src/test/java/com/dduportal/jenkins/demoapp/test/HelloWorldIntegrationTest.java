package com.dduportal.jenkins.demoapp.test;

import com.dduportal.jenkins.demoapp.HelloWorldApplication;
import com.dduportal.jenkins.demoapp.HelloWorldConfiguration;
import com.dduportal.jenkins.demoapp.api.Saying;
import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import javax.ws.rs.client.Client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@Category(IntegrationTest.class)
public class HelloWorldIntegrationTest {
  
}
