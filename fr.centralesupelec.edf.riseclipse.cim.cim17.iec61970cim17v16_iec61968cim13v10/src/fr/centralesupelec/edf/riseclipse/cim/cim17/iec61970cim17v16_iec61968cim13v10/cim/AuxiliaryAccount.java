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
 * A representation of the model object '<em><b>Auxiliary Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getBalance <em>Balance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getDue <em>Due</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getCharges <em>Charges</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount()
 * @model
 * @generated
 */
public interface AuxiliaryAccount extends Document {
    /**
     * Returns the value of the '<em><b>Balance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Balance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Balance</em>' attribute.
     * @see #isSetBalance()
     * @see #unsetBalance()
     * @see #setBalance(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount_Balance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAccount.balance' kind='element'"
     * @generated
     */
    BigDecimal getBalance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getBalance <em>Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Balance</em>' attribute.
     * @see #isSetBalance()
     * @see #unsetBalance()
     * @see #getBalance()
     * @generated
     */
    void setBalance( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getBalance <em>Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBalance()
     * @see #getBalance()
     * @see #setBalance(BigDecimal)
     * @generated
     */
    void unsetBalance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getBalance <em>Balance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Balance</em>' attribute is set.
     * @see #unsetBalance()
     * @see #getBalance()
     * @see #setBalance(BigDecimal)
     * @generated
     */
    boolean isSetBalance();

    /**
     * Returns the value of the '<em><b>Principle Amount</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Principle Amount</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Principle Amount</em>' attribute.
     * @see #isSetPrincipleAmount()
     * @see #unsetPrincipleAmount()
     * @see #setPrincipleAmount(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount_PrincipleAmount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAccount.principleAmount' kind='element'"
     * @generated
     */
    BigDecimal getPrincipleAmount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Principle Amount</em>' attribute.
     * @see #isSetPrincipleAmount()
     * @see #unsetPrincipleAmount()
     * @see #getPrincipleAmount()
     * @generated
     */
    void setPrincipleAmount( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrincipleAmount()
     * @see #getPrincipleAmount()
     * @see #setPrincipleAmount(BigDecimal)
     * @generated
     */
    void unsetPrincipleAmount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPrincipleAmount <em>Principle Amount</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Principle Amount</em>' attribute is set.
     * @see #unsetPrincipleAmount()
     * @see #getPrincipleAmount()
     * @see #setPrincipleAmount(BigDecimal)
     * @generated
     */
    boolean isSetPrincipleAmount();

    /**
     * Returns the value of the '<em><b>Due</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Due</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Due</em>' containment reference.
     * @see #isSetDue()
     * @see #unsetDue()
     * @see #setDue(Due)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount_Due()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAccount.due' kind='element'"
     * @generated
     */
    Due getDue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getDue <em>Due</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Due</em>' containment reference.
     * @see #isSetDue()
     * @see #unsetDue()
     * @see #getDue()
     * @generated
     */
    void setDue( Due value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getDue <em>Due</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDue()
     * @see #getDue()
     * @see #setDue(Due)
     * @generated
     */
    void unsetDue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getDue <em>Due</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Due</em>' containment reference is set.
     * @see #unsetDue()
     * @see #getDue()
     * @see #setDue(Due)
     * @generated
     */
    boolean isSetDue();

    /**
     * Returns the value of the '<em><b>Last Credit</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Credit</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Credit</em>' containment reference.
     * @see #isSetLastCredit()
     * @see #unsetLastCredit()
     * @see #setLastCredit(AccountMovement)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount_LastCredit()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAccount.lastCredit' kind='element'"
     * @generated
     */
    AccountMovement getLastCredit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Credit</em>' containment reference.
     * @see #isSetLastCredit()
     * @see #unsetLastCredit()
     * @see #getLastCredit()
     * @generated
     */
    void setLastCredit( AccountMovement value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLastCredit()
     * @see #getLastCredit()
     * @see #setLastCredit(AccountMovement)
     * @generated
     */
    void unsetLastCredit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getLastCredit <em>Last Credit</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Last Credit</em>' containment reference is set.
     * @see #unsetLastCredit()
     * @see #getLastCredit()
     * @see #setLastCredit(AccountMovement)
     * @generated
     */
    boolean isSetLastCredit();

    /**
     * Returns the value of the '<em><b>Last Debit</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Debit</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Debit</em>' containment reference.
     * @see #isSetLastDebit()
     * @see #unsetLastDebit()
     * @see #setLastDebit(AccountMovement)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount_LastDebit()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAccount.lastDebit' kind='element'"
     * @generated
     */
    AccountMovement getLastDebit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Debit</em>' containment reference.
     * @see #isSetLastDebit()
     * @see #unsetLastDebit()
     * @see #getLastDebit()
     * @generated
     */
    void setLastDebit( AccountMovement value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLastDebit()
     * @see #getLastDebit()
     * @see #setLastDebit(AccountMovement)
     * @generated
     */
    void unsetLastDebit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getLastDebit <em>Last Debit</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Last Debit</em>' containment reference is set.
     * @see #unsetLastDebit()
     * @see #getLastDebit()
     * @see #setLastDebit(AccountMovement)
     * @generated
     */
    boolean isSetLastDebit();

    /**
     * Returns the value of the '<em><b>Auxiliary Agreement</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auxiliary Agreement</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auxiliary Agreement</em>' reference.
     * @see #isSetAuxiliaryAgreement()
     * @see #unsetAuxiliaryAgreement()
     * @see #setAuxiliaryAgreement(AuxiliaryAgreement)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount_AuxiliaryAgreement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAgreement#getAuxiliaryAccounts
     * @model opposite="AuxiliaryAccounts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAccount.AuxiliaryAgreement' kind='element'"
     * @generated
     */
    AuxiliaryAgreement getAuxiliaryAgreement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auxiliary Agreement</em>' reference.
     * @see #isSetAuxiliaryAgreement()
     * @see #unsetAuxiliaryAgreement()
     * @see #getAuxiliaryAgreement()
     * @generated
     */
    void setAuxiliaryAgreement( AuxiliaryAgreement value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxiliaryAgreement()
     * @see #getAuxiliaryAgreement()
     * @see #setAuxiliaryAgreement(AuxiliaryAgreement)
     * @generated
     */
    void unsetAuxiliaryAgreement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getAuxiliaryAgreement <em>Auxiliary Agreement</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auxiliary Agreement</em>' reference is set.
     * @see #unsetAuxiliaryAgreement()
     * @see #getAuxiliaryAgreement()
     * @see #setAuxiliaryAgreement(AuxiliaryAgreement)
     * @generated
     */
    boolean isSetAuxiliaryAgreement();

    /**
     * Returns the value of the '<em><b>Payment Transactions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getAuxiliaryAccount <em>Auxiliary Account</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Payment Transactions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Payment Transactions</em>' reference list.
     * @see #isSetPaymentTransactions()
     * @see #unsetPaymentTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount_PaymentTransactions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction#getAuxiliaryAccount
     * @model opposite="AuxiliaryAccount" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAccount.PaymentTransactions' kind='element'"
     * @generated
     */
    EList< Transaction > getPaymentTransactions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPaymentTransactions()
     * @see #getPaymentTransactions()
     * @generated
     */
    void unsetPaymentTransactions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getPaymentTransactions <em>Payment Transactions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Payment Transactions</em>' reference list is set.
     * @see #unsetPaymentTransactions()
     * @see #getPaymentTransactions()
     * @generated
     */
    boolean isSetPaymentTransactions();

    /**
     * Returns the value of the '<em><b>Charges</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getAuxiliaryAccounts <em>Auxiliary Accounts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Charges</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Charges</em>' reference list.
     * @see #isSetCharges()
     * @see #unsetCharges()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAuxiliaryAccount_Charges()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Charge#getAuxiliaryAccounts
     * @model opposite="AuxiliaryAccounts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AuxiliaryAccount.Charges' kind='element'"
     * @generated
     */
    EList< Charge > getCharges();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getCharges <em>Charges</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCharges()
     * @see #getCharges()
     * @generated
     */
    void unsetCharges();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryAccount#getCharges <em>Charges</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Charges</em>' reference list is set.
     * @see #unsetCharges()
     * @see #getCharges()
     * @generated
     */
    boolean isSetCharges();

} // AuxiliaryAccount
