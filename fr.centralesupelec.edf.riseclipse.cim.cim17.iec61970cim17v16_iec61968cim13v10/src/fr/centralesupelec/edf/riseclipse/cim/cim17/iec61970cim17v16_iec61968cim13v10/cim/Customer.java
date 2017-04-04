/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getLocale <em>Locale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getPucNumber <em>Puc Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getCustomerAccounts <em>Customer Accounts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getEndDevices <em>End Devices</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getWorks <em>Works</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends OrganisationRole {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(CustomerKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.kind' kind='element'"
     * @generated
     */
    CustomerKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( CustomerKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(CustomerKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(CustomerKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Locale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Locale</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Locale</em>' attribute.
     * @see #isSetLocale()
     * @see #unsetLocale()
     * @see #setLocale(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_Locale()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.locale' kind='element'"
     * @generated
     */
    String getLocale();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getLocale <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Locale</em>' attribute.
     * @see #isSetLocale()
     * @see #unsetLocale()
     * @see #getLocale()
     * @generated
     */
    void setLocale( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getLocale <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocale()
     * @see #getLocale()
     * @see #setLocale(String)
     * @generated
     */
    void unsetLocale();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getLocale <em>Locale</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Locale</em>' attribute is set.
     * @see #unsetLocale()
     * @see #getLocale()
     * @see #setLocale(String)
     * @generated
     */
    boolean isSetLocale();

    /**
     * Returns the value of the '<em><b>Puc Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Puc Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Puc Number</em>' attribute.
     * @see #isSetPucNumber()
     * @see #unsetPucNumber()
     * @see #setPucNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_PucNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.pucNumber' kind='element'"
     * @generated
     */
    String getPucNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getPucNumber <em>Puc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Puc Number</em>' attribute.
     * @see #isSetPucNumber()
     * @see #unsetPucNumber()
     * @see #getPucNumber()
     * @generated
     */
    void setPucNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getPucNumber <em>Puc Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPucNumber()
     * @see #getPucNumber()
     * @see #setPucNumber(String)
     * @generated
     */
    void unsetPucNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getPucNumber <em>Puc Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Puc Number</em>' attribute is set.
     * @see #unsetPucNumber()
     * @see #getPucNumber()
     * @see #setPucNumber(String)
     * @generated
     */
    boolean isSetPucNumber();

    /**
     * Returns the value of the '<em><b>Special Need</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Special Need</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Special Need</em>' attribute.
     * @see #isSetSpecialNeed()
     * @see #unsetSpecialNeed()
     * @see #setSpecialNeed(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_SpecialNeed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.specialNeed' kind='element'"
     * @generated
     */
    String getSpecialNeed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getSpecialNeed <em>Special Need</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Special Need</em>' attribute.
     * @see #isSetSpecialNeed()
     * @see #unsetSpecialNeed()
     * @see #getSpecialNeed()
     * @generated
     */
    void setSpecialNeed( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getSpecialNeed <em>Special Need</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpecialNeed()
     * @see #getSpecialNeed()
     * @see #setSpecialNeed(String)
     * @generated
     */
    void unsetSpecialNeed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getSpecialNeed <em>Special Need</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Special Need</em>' attribute is set.
     * @see #unsetSpecialNeed()
     * @see #getSpecialNeed()
     * @see #setSpecialNeed(String)
     * @generated
     */
    boolean isSetSpecialNeed();

    /**
     * Returns the value of the '<em><b>Priority</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Priority</em>' containment reference.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #setPriority(Priority)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_Priority()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.priority' kind='element'"
     * @generated
     */
    Priority getPriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getPriority <em>Priority</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' containment reference.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #getPriority()
     * @generated
     */
    void setPriority( Priority value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getPriority <em>Priority</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriority()
     * @see #getPriority()
     * @see #setPriority(Priority)
     * @generated
     */
    void unsetPriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getPriority <em>Priority</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Priority</em>' containment reference is set.
     * @see #unsetPriority()
     * @see #getPriority()
     * @see #setPriority(Priority)
     * @generated
     */
    boolean isSetPriority();

    /**
     * Returns the value of the '<em><b>Status</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' containment reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #setStatus(Status)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_Status()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.status' kind='element'"
     * @generated
     */
    Status getStatus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getStatus <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' containment reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #getStatus()
     * @generated
     */
    void setStatus( Status value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getStatus <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    void unsetStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getStatus <em>Status</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Status</em>' containment reference is set.
     * @see #unsetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    boolean isSetStatus();

    /**
     * Returns the value of the '<em><b>Customer Accounts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomer <em>Customer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Accounts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Accounts</em>' reference list.
     * @see #isSetCustomerAccounts()
     * @see #unsetCustomerAccounts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_CustomerAccounts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomer
     * @model opposite="Customer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.CustomerAccounts' kind='element'"
     * @generated
     */
    EList< CustomerAccount > getCustomerAccounts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getCustomerAccounts <em>Customer Accounts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAccounts()
     * @see #getCustomerAccounts()
     * @generated
     */
    void unsetCustomerAccounts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getCustomerAccounts <em>Customer Accounts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Accounts</em>' reference list is set.
     * @see #unsetCustomerAccounts()
     * @see #getCustomerAccounts()
     * @generated
     */
    boolean isSetCustomerAccounts();

    /**
     * Returns the value of the '<em><b>End Devices</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getCustomer <em>Customer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Devices</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Devices</em>' reference list.
     * @see #isSetEndDevices()
     * @see #unsetEndDevices()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_EndDevices()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDevice#getCustomer
     * @model opposite="Customer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.EndDevices' kind='element'"
     * @generated
     */
    EList< EndDevice > getEndDevices();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getEndDevices <em>End Devices</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndDevices()
     * @see #getEndDevices()
     * @generated
     */
    void unsetEndDevices();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getEndDevices <em>End Devices</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Devices</em>' reference list is set.
     * @see #unsetEndDevices()
     * @see #getEndDevices()
     * @generated
     */
    boolean isSetEndDevices();

    /**
     * Returns the value of the '<em><b>Works</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getCustomers <em>Customers</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Works</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Works</em>' reference list.
     * @see #isSetWorks()
     * @see #unsetWorks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_Works()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getCustomers
     * @model opposite="Customers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.Works' kind='element'"
     * @generated
     */
    EList< Work > getWorks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getWorks <em>Works</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorks()
     * @see #getWorks()
     * @generated
     */
    void unsetWorks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getWorks <em>Works</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Works</em>' reference list is set.
     * @see #unsetWorks()
     * @see #getWorks()
     * @generated
     */
    boolean isSetWorks();

    /**
     * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement#getCustomer <em>Customer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Agreements</em>' reference list.
     * @see #isSetCustomerAgreements()
     * @see #unsetCustomerAgreements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_CustomerAgreements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement#getCustomer
     * @model opposite="Customer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.CustomerAgreements' kind='element'"
     * @generated
     */
    EList< CustomerAgreement > getCustomerAgreements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getCustomerAgreements <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAgreements()
     * @see #getCustomerAgreements()
     * @generated
     */
    void unsetCustomerAgreements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getCustomerAgreements <em>Customer Agreements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Agreements</em>' reference list is set.
     * @see #unsetCustomerAgreements()
     * @see #getCustomerAgreements()
     * @generated
     */
    boolean isSetCustomerAgreements();

    /**
     * Returns the value of the '<em><b>Trouble Tickets</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getCustomer <em>Customer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trouble Tickets</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trouble Tickets</em>' reference list.
     * @see #isSetTroubleTickets()
     * @see #unsetTroubleTickets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_TroubleTickets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getCustomer
     * @model opposite="Customer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.TroubleTickets' kind='element'"
     * @generated
     */
    EList< TroubleTicket > getTroubleTickets();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getTroubleTickets <em>Trouble Tickets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTroubleTickets()
     * @see #getTroubleTickets()
     * @generated
     */
    void unsetTroubleTickets();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getTroubleTickets <em>Trouble Tickets</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trouble Tickets</em>' reference list is set.
     * @see #unsetTroubleTickets()
     * @see #getTroubleTickets()
     * @generated
     */
    boolean isSetTroubleTickets();

    /**
     * Returns the value of the '<em><b>Notifications</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getCustomer <em>Customer</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notifications</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Notifications</em>' reference list.
     * @see #isSetNotifications()
     * @see #unsetNotifications()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomer_Notifications()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getCustomer
     * @model opposite="Customer" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Customer.Notifications' kind='element'"
     * @generated
     */
    EList< CustomerNotification > getNotifications();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getNotifications <em>Notifications</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNotifications()
     * @see #getNotifications()
     * @generated
     */
    void unsetNotifications();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getNotifications <em>Notifications</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Notifications</em>' reference list is set.
     * @see #unsetNotifications()
     * @see #getNotifications()
     * @generated
     */
    boolean isSetNotifications();

} // Customer
