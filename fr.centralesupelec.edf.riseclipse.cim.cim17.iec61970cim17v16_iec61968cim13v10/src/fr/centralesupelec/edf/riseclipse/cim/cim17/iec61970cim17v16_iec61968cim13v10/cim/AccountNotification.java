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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerNotificationType <em>Customer Notification Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getMethodType <em>Method Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getNote <em>Note</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getTime <em>Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerAccount <em>Customer Account</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccountNotification()
 * @model
 * @generated
 */
public interface AccountNotification extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Customer Notification Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Notification Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Notification Type</em>' attribute.
     * @see #isSetCustomerNotificationType()
     * @see #unsetCustomerNotificationType()
     * @see #setCustomerNotificationType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccountNotification_CustomerNotificationType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccountNotification.customerNotificationType' kind='element'"
     * @generated
     */
    String getCustomerNotificationType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerNotificationType <em>Customer Notification Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Notification Type</em>' attribute.
     * @see #isSetCustomerNotificationType()
     * @see #unsetCustomerNotificationType()
     * @see #getCustomerNotificationType()
     * @generated
     */
    void setCustomerNotificationType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerNotificationType <em>Customer Notification Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerNotificationType()
     * @see #getCustomerNotificationType()
     * @see #setCustomerNotificationType(String)
     * @generated
     */
    void unsetCustomerNotificationType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerNotificationType <em>Customer Notification Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Notification Type</em>' attribute is set.
     * @see #unsetCustomerNotificationType()
     * @see #getCustomerNotificationType()
     * @see #setCustomerNotificationType(String)
     * @generated
     */
    boolean isSetCustomerNotificationType();

    /**
     * Returns the value of the '<em><b>Method Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Method Type</em>' attribute.
     * @see #isSetMethodType()
     * @see #unsetMethodType()
     * @see #setMethodType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccountNotification_MethodType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccountNotification.methodType' kind='element'"
     * @generated
     */
    String getMethodType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getMethodType <em>Method Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Method Type</em>' attribute.
     * @see #isSetMethodType()
     * @see #unsetMethodType()
     * @see #getMethodType()
     * @generated
     */
    void setMethodType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getMethodType <em>Method Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMethodType()
     * @see #getMethodType()
     * @see #setMethodType(String)
     * @generated
     */
    void unsetMethodType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getMethodType <em>Method Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Method Type</em>' attribute is set.
     * @see #unsetMethodType()
     * @see #getMethodType()
     * @see #setMethodType(String)
     * @generated
     */
    boolean isSetMethodType();

    /**
     * Returns the value of the '<em><b>Note</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Note</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Note</em>' attribute.
     * @see #isSetNote()
     * @see #unsetNote()
     * @see #setNote(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccountNotification_Note()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccountNotification.note' kind='element'"
     * @generated
     */
    String getNote();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getNote <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Note</em>' attribute.
     * @see #isSetNote()
     * @see #unsetNote()
     * @see #getNote()
     * @generated
     */
    void setNote( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getNote <em>Note</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNote()
     * @see #getNote()
     * @see #setNote(String)
     * @generated
     */
    void unsetNote();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getNote <em>Note</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Note</em>' attribute is set.
     * @see #unsetNote()
     * @see #getNote()
     * @see #setNote(String)
     * @generated
     */
    boolean isSetNote();

    /**
     * Returns the value of the '<em><b>Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time</em>' attribute.
     * @see #isSetTime()
     * @see #unsetTime()
     * @see #setTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccountNotification_Time()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccountNotification.time' kind='element'"
     * @generated
     */
    Date getTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time</em>' attribute.
     * @see #isSetTime()
     * @see #unsetTime()
     * @see #getTime()
     * @generated
     */
    void setTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getTime <em>Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTime()
     * @see #getTime()
     * @see #setTime(Date)
     * @generated
     */
    void unsetTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getTime <em>Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time</em>' attribute is set.
     * @see #unsetTime()
     * @see #getTime()
     * @see #setTime(Date)
     * @generated
     */
    boolean isSetTime();

    /**
     * Returns the value of the '<em><b>Customer Account</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getAccountNotification <em>Account Notification</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Account</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Account</em>' reference.
     * @see #isSetCustomerAccount()
     * @see #unsetCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAccountNotification_CustomerAccount()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getAccountNotification
     * @model opposite="AccountNotification" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AccountNotification.CustomerAccount' kind='element'"
     * @generated
     */
    CustomerAccount getCustomerAccount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerAccount <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer Account</em>' reference.
     * @see #isSetCustomerAccount()
     * @see #unsetCustomerAccount()
     * @see #getCustomerAccount()
     * @generated
     */
    void setCustomerAccount( CustomerAccount value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerAccount <em>Customer Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAccount()
     * @see #getCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @generated
     */
    void unsetCustomerAccount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerAccount <em>Customer Account</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Account</em>' reference is set.
     * @see #unsetCustomerAccount()
     * @see #getCustomerAccount()
     * @see #setCustomerAccount(CustomerAccount)
     * @generated
     */
    boolean isSetCustomerAccount();

} // AccountNotification
