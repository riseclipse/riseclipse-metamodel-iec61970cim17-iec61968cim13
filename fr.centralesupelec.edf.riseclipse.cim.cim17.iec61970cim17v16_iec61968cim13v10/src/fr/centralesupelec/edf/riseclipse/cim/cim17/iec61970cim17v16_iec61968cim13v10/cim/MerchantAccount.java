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
 * A representation of the model object '<em><b>Merchant Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getCurrentBalance <em>Current Balance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getTransactors <em>Transactors</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMerchantAccount()
 * @model
 * @generated
 */
public interface MerchantAccount extends Document {
    /**
     * Returns the value of the '<em><b>Current Balance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Balance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Balance</em>' attribute.
     * @see #isSetCurrentBalance()
     * @see #unsetCurrentBalance()
     * @see #setCurrentBalance(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMerchantAccount_CurrentBalance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MerchantAccount.currentBalance' kind='element'"
     * @generated
     */
    BigDecimal getCurrentBalance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getCurrentBalance <em>Current Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Balance</em>' attribute.
     * @see #isSetCurrentBalance()
     * @see #unsetCurrentBalance()
     * @see #getCurrentBalance()
     * @generated
     */
    void setCurrentBalance( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getCurrentBalance <em>Current Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrentBalance()
     * @see #getCurrentBalance()
     * @see #setCurrentBalance(BigDecimal)
     * @generated
     */
    void unsetCurrentBalance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getCurrentBalance <em>Current Balance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current Balance</em>' attribute is set.
     * @see #unsetCurrentBalance()
     * @see #getCurrentBalance()
     * @see #setCurrentBalance(BigDecimal)
     * @generated
     */
    boolean isSetCurrentBalance();

    /**
     * Returns the value of the '<em><b>Provisional Balance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Provisional Balance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Provisional Balance</em>' attribute.
     * @see #isSetProvisionalBalance()
     * @see #unsetProvisionalBalance()
     * @see #setProvisionalBalance(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMerchantAccount_ProvisionalBalance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MerchantAccount.provisionalBalance' kind='element'"
     * @generated
     */
    BigDecimal getProvisionalBalance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Provisional Balance</em>' attribute.
     * @see #isSetProvisionalBalance()
     * @see #unsetProvisionalBalance()
     * @see #getProvisionalBalance()
     * @generated
     */
    void setProvisionalBalance( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProvisionalBalance()
     * @see #getProvisionalBalance()
     * @see #setProvisionalBalance(BigDecimal)
     * @generated
     */
    void unsetProvisionalBalance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getProvisionalBalance <em>Provisional Balance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Provisional Balance</em>' attribute is set.
     * @see #unsetProvisionalBalance()
     * @see #getProvisionalBalance()
     * @see #setProvisionalBalance(BigDecimal)
     * @generated
     */
    boolean isSetProvisionalBalance();

    /**
     * Returns the value of the '<em><b>Merchant Agreement</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAgreement#getMerchantAccounts <em>Merchant Accounts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Merchant Agreement</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Merchant Agreement</em>' reference.
     * @see #isSetMerchantAgreement()
     * @see #unsetMerchantAgreement()
     * @see #setMerchantAgreement(MerchantAgreement)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMerchantAccount_MerchantAgreement()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAgreement#getMerchantAccounts
     * @model opposite="MerchantAccounts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MerchantAccount.MerchantAgreement' kind='element'"
     * @generated
     */
    MerchantAgreement getMerchantAgreement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Merchant Agreement</em>' reference.
     * @see #isSetMerchantAgreement()
     * @see #unsetMerchantAgreement()
     * @see #getMerchantAgreement()
     * @generated
     */
    void setMerchantAgreement( MerchantAgreement value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMerchantAgreement()
     * @see #getMerchantAgreement()
     * @see #setMerchantAgreement(MerchantAgreement)
     * @generated
     */
    void unsetMerchantAgreement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getMerchantAgreement <em>Merchant Agreement</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Merchant Agreement</em>' reference is set.
     * @see #unsetMerchantAgreement()
     * @see #getMerchantAgreement()
     * @see #setMerchantAgreement(MerchantAgreement)
     * @generated
     */
    boolean isSetMerchantAgreement();

    /**
     * Returns the value of the '<em><b>Transactors</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transactor}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transactor#getMerchantAccounts <em>Merchant Accounts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transactors</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transactors</em>' reference list.
     * @see #isSetTransactors()
     * @see #unsetTransactors()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMerchantAccount_Transactors()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transactor#getMerchantAccounts
     * @model opposite="MerchantAccounts" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MerchantAccount.Transactors' kind='element'"
     * @generated
     */
    EList< Transactor > getTransactors();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getTransactors <em>Transactors</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransactors()
     * @see #getTransactors()
     * @generated
     */
    void unsetTransactors();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getTransactors <em>Transactors</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transactors</em>' reference list is set.
     * @see #unsetTransactors()
     * @see #getTransactors()
     * @generated
     */
    boolean isSetTransactors();

    /**
     * Returns the value of the '<em><b>Vendor Shifts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantAccount <em>Merchant Account</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vendor Shifts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vendor Shifts</em>' reference list.
     * @see #isSetVendorShifts()
     * @see #unsetVendorShifts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getMerchantAccount_VendorShifts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift#getMerchantAccount
     * @model opposite="MerchantAccount" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='MerchantAccount.VendorShifts' kind='element'"
     * @generated
     */
    EList< VendorShift > getVendorShifts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVendorShifts()
     * @see #getVendorShifts()
     * @generated
     */
    void unsetVendorShifts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount#getVendorShifts <em>Vendor Shifts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vendor Shifts</em>' reference list is set.
     * @see #unsetVendorShifts()
     * @see #getVendorShifts()
     * @generated
     */
    boolean isSetVendorShifts();

} // MerchantAccount
