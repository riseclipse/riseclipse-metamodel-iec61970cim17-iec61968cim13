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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Account Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getBranchCode <em>Branch Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getHolderID <em>Holder ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getHolderName <em>Holder Name</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBankAccountDetail()
 * @model
 * @generated
 */
public interface BankAccountDetail extends EObject {
    /**
     * Returns the value of the '<em><b>Account Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Account Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Account Number</em>' attribute.
     * @see #isSetAccountNumber()
     * @see #unsetAccountNumber()
     * @see #setAccountNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBankAccountDetail_AccountNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BankAccountDetail.accountNumber' kind='element'"
     * @generated
     */
    String getAccountNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getAccountNumber <em>Account Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Account Number</em>' attribute.
     * @see #isSetAccountNumber()
     * @see #unsetAccountNumber()
     * @see #getAccountNumber()
     * @generated
     */
    void setAccountNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getAccountNumber <em>Account Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAccountNumber()
     * @see #getAccountNumber()
     * @see #setAccountNumber(String)
     * @generated
     */
    void unsetAccountNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getAccountNumber <em>Account Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Account Number</em>' attribute is set.
     * @see #unsetAccountNumber()
     * @see #getAccountNumber()
     * @see #setAccountNumber(String)
     * @generated
     */
    boolean isSetAccountNumber();

    /**
     * Returns the value of the '<em><b>Bank Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bank Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bank Name</em>' attribute.
     * @see #isSetBankName()
     * @see #unsetBankName()
     * @see #setBankName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBankAccountDetail_BankName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BankAccountDetail.bankName' kind='element'"
     * @generated
     */
    String getBankName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getBankName <em>Bank Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bank Name</em>' attribute.
     * @see #isSetBankName()
     * @see #unsetBankName()
     * @see #getBankName()
     * @generated
     */
    void setBankName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getBankName <em>Bank Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBankName()
     * @see #getBankName()
     * @see #setBankName(String)
     * @generated
     */
    void unsetBankName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getBankName <em>Bank Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bank Name</em>' attribute is set.
     * @see #unsetBankName()
     * @see #getBankName()
     * @see #setBankName(String)
     * @generated
     */
    boolean isSetBankName();

    /**
     * Returns the value of the '<em><b>Branch Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Branch Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Branch Code</em>' attribute.
     * @see #isSetBranchCode()
     * @see #unsetBranchCode()
     * @see #setBranchCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBankAccountDetail_BranchCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BankAccountDetail.branchCode' kind='element'"
     * @generated
     */
    String getBranchCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getBranchCode <em>Branch Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Branch Code</em>' attribute.
     * @see #isSetBranchCode()
     * @see #unsetBranchCode()
     * @see #getBranchCode()
     * @generated
     */
    void setBranchCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getBranchCode <em>Branch Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBranchCode()
     * @see #getBranchCode()
     * @see #setBranchCode(String)
     * @generated
     */
    void unsetBranchCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getBranchCode <em>Branch Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Branch Code</em>' attribute is set.
     * @see #unsetBranchCode()
     * @see #getBranchCode()
     * @see #setBranchCode(String)
     * @generated
     */
    boolean isSetBranchCode();

    /**
     * Returns the value of the '<em><b>Holder ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Holder ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Holder ID</em>' attribute.
     * @see #isSetHolderID()
     * @see #unsetHolderID()
     * @see #setHolderID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBankAccountDetail_HolderID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BankAccountDetail.holderID' kind='element'"
     * @generated
     */
    String getHolderID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getHolderID <em>Holder ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Holder ID</em>' attribute.
     * @see #isSetHolderID()
     * @see #unsetHolderID()
     * @see #getHolderID()
     * @generated
     */
    void setHolderID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getHolderID <em>Holder ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHolderID()
     * @see #getHolderID()
     * @see #setHolderID(String)
     * @generated
     */
    void unsetHolderID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getHolderID <em>Holder ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Holder ID</em>' attribute is set.
     * @see #unsetHolderID()
     * @see #getHolderID()
     * @see #setHolderID(String)
     * @generated
     */
    boolean isSetHolderID();

    /**
     * Returns the value of the '<em><b>Holder Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Holder Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Holder Name</em>' attribute.
     * @see #isSetHolderName()
     * @see #unsetHolderName()
     * @see #setHolderName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBankAccountDetail_HolderName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BankAccountDetail.holderName' kind='element'"
     * @generated
     */
    String getHolderName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getHolderName <em>Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Holder Name</em>' attribute.
     * @see #isSetHolderName()
     * @see #unsetHolderName()
     * @see #getHolderName()
     * @generated
     */
    void setHolderName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getHolderName <em>Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHolderName()
     * @see #getHolderName()
     * @see #setHolderName(String)
     * @generated
     */
    void unsetHolderName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail#getHolderName <em>Holder Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Holder Name</em>' attribute is set.
     * @see #unsetHolderName()
     * @see #getHolderName()
     * @see #setHolderName(String)
     * @generated
     */
    boolean isSetHolderName();

} // BankAccountDetail
