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

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getBillingCycle <em>Billing Cycle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getBudgetBill <em>Budget Bill</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getLastBillAmount <em>Last Bill Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getAccountNotification <em>Account Notification</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerAccount()
 * @model
 * @generated
 */
public interface CustomerAccount extends Document {
    /**
     * Returns the value of the '<em><b>Billing Cycle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Billing Cycle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Billing Cycle</em>' attribute.
     * @see #isSetBillingCycle()
     * @see #unsetBillingCycle()
     * @see #setBillingCycle(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerAccount_BillingCycle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerAccount.billingCycle' kind='element'"
     * @generated
     */
    String getBillingCycle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getBillingCycle <em>Billing Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Billing Cycle</em>' attribute.
     * @see #isSetBillingCycle()
     * @see #unsetBillingCycle()
     * @see #getBillingCycle()
     * @generated
     */
    void setBillingCycle( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getBillingCycle <em>Billing Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBillingCycle()
     * @see #getBillingCycle()
     * @see #setBillingCycle(String)
     * @generated
     */
    void unsetBillingCycle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getBillingCycle <em>Billing Cycle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Billing Cycle</em>' attribute is set.
     * @see #unsetBillingCycle()
     * @see #getBillingCycle()
     * @see #setBillingCycle(String)
     * @generated
     */
    boolean isSetBillingCycle();

    /**
     * Returns the value of the '<em><b>Budget Bill</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Budget Bill</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Budget Bill</em>' attribute.
     * @see #isSetBudgetBill()
     * @see #unsetBudgetBill()
     * @see #setBudgetBill(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerAccount_BudgetBill()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerAccount.budgetBill' kind='element'"
     * @generated
     */
    String getBudgetBill();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getBudgetBill <em>Budget Bill</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Budget Bill</em>' attribute.
     * @see #isSetBudgetBill()
     * @see #unsetBudgetBill()
     * @see #getBudgetBill()
     * @generated
     */
    void setBudgetBill( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getBudgetBill <em>Budget Bill</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBudgetBill()
     * @see #getBudgetBill()
     * @see #setBudgetBill(String)
     * @generated
     */
    void unsetBudgetBill();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getBudgetBill <em>Budget Bill</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Budget Bill</em>' attribute is set.
     * @see #unsetBudgetBill()
     * @see #getBudgetBill()
     * @see #setBudgetBill(String)
     * @generated
     */
    boolean isSetBudgetBill();

    /**
     * Returns the value of the '<em><b>Last Bill Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Bill Amount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Bill Amount</em>' attribute.
     * @see #isSetLastBillAmount()
     * @see #unsetLastBillAmount()
     * @see #setLastBillAmount(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerAccount_LastBillAmount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerAccount.lastBillAmount' kind='element'"
     * @generated
     */
    BigDecimal getLastBillAmount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getLastBillAmount <em>Last Bill Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Bill Amount</em>' attribute.
     * @see #isSetLastBillAmount()
     * @see #unsetLastBillAmount()
     * @see #getLastBillAmount()
     * @generated
     */
    void setLastBillAmount( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getLastBillAmount <em>Last Bill Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLastBillAmount()
     * @see #getLastBillAmount()
     * @see #setLastBillAmount(BigDecimal)
     * @generated
     */
    void unsetLastBillAmount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getLastBillAmount <em>Last Bill Amount</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Last Bill Amount</em>' attribute is set.
     * @see #unsetLastBillAmount()
     * @see #getLastBillAmount()
     * @see #setLastBillAmount(BigDecimal)
     * @generated
     */
    boolean isSetLastBillAmount();

    /**
     * Returns the value of the '<em><b>Account Notification</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerAccount <em>Customer Account</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Account Notification</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Account Notification</em>' reference list.
     * @see #isSetAccountNotification()
     * @see #unsetAccountNotification()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerAccount_AccountNotification()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccountNotification#getCustomerAccount
     * @model opposite="CustomerAccount" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerAccount.AccountNotification' kind='element'"
     * @generated
     */
    EList< AccountNotification > getAccountNotification();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getAccountNotification <em>Account Notification</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccountNotification()
     * @see #getAccountNotification()
     * @generated
     */
    void unsetAccountNotification();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getAccountNotification <em>Account Notification</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Account Notification</em>' reference list is set.
     * @see #unsetAccountNotification()
     * @see #getAccountNotification()
     * @generated
     */
    boolean isSetAccountNotification();

    /**
     * Returns the value of the '<em><b>Customer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getCustomerAccounts <em>Customer Accounts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer</em>' reference.
     * @see #isSetCustomer()
     * @see #unsetCustomer()
     * @see #setCustomer(Customer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerAccount_Customer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getCustomerAccounts
     * @model opposite="CustomerAccounts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerAccount.Customer' kind='element'"
     * @generated
     */
    Customer getCustomer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer</em>' reference.
     * @see #isSetCustomer()
     * @see #unsetCustomer()
     * @see #getCustomer()
     * @generated
     */
    void setCustomer( Customer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    void unsetCustomer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomer <em>Customer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer</em>' reference is set.
     * @see #unsetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    boolean isSetCustomer();

    /**
     * Returns the value of the '<em><b>Customer Agreements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement#getCustomerAccount <em>Customer Account</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer Agreements</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer Agreements</em>' reference list.
     * @see #isSetCustomerAgreements()
     * @see #unsetCustomerAgreements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerAccount_CustomerAgreements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement#getCustomerAccount
     * @model opposite="CustomerAccount" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerAccount.CustomerAgreements' kind='element'"
     * @generated
     */
    EList< CustomerAgreement > getCustomerAgreements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomerAgreements()
     * @see #getCustomerAgreements()
     * @generated
     */
    void unsetCustomerAgreements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getCustomerAgreements <em>Customer Agreements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer Agreements</em>' reference list is set.
     * @see #unsetCustomerAgreements()
     * @see #getCustomerAgreements()
     * @generated
     */
    boolean isSetCustomerAgreements();

    /**
     * Returns the value of the '<em><b>Payment Transactions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCustomerAccount <em>Customer Account</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Payment Transactions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Payment Transactions</em>' reference list.
     * @see #isSetPaymentTransactions()
     * @see #unsetPaymentTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerAccount_PaymentTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getCustomerAccount
     * @model opposite="CustomerAccount" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerAccount.PaymentTransactions' kind='element'"
     * @generated
     */
    EList< Transaction > getPaymentTransactions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPaymentTransactions()
     * @see #getPaymentTransactions()
     * @generated
     */
    void unsetPaymentTransactions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAccount#getPaymentTransactions <em>Payment Transactions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Payment Transactions</em>' reference list is set.
     * @see #unsetPaymentTransactions()
     * @see #getPaymentTransactions()
     * @generated
     */
    boolean isSetPaymentTransactions();

} // CustomerAccount
