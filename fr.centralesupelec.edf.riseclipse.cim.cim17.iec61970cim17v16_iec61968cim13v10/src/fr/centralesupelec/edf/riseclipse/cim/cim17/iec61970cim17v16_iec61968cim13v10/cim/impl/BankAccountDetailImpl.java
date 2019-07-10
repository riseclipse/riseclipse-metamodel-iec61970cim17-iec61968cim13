/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BankAccountDetail;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank Account Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BankAccountDetailImpl#getAccountNumber <em>Account Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BankAccountDetailImpl#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BankAccountDetailImpl#getBranchCode <em>Branch Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BankAccountDetailImpl#getHolderID <em>Holder ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BankAccountDetailImpl#getHolderName <em>Holder Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankAccountDetailImpl extends MinimalEObjectImpl.Container implements BankAccountDetail {
    /**
     * The default value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccountNumber()
     * @generated
     * @ordered
     */
    protected static final String ACCOUNT_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAccountNumber() <em>Account Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccountNumber()
     * @generated
     * @ordered
     */
    protected String accountNumber = ACCOUNT_NUMBER_EDEFAULT;

    /**
     * This is true if the Account Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accountNumberESet;

    /**
     * The default value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBankName()
     * @generated
     * @ordered
     */
    protected static final String BANK_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBankName()
     * @generated
     * @ordered
     */
    protected String bankName = BANK_NAME_EDEFAULT;

    /**
     * This is true if the Bank Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bankNameESet;

    /**
     * The default value of the '{@link #getBranchCode() <em>Branch Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranchCode()
     * @generated
     * @ordered
     */
    protected static final String BRANCH_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBranchCode() <em>Branch Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranchCode()
     * @generated
     * @ordered
     */
    protected String branchCode = BRANCH_CODE_EDEFAULT;

    /**
     * This is true if the Branch Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean branchCodeESet;

    /**
     * The default value of the '{@link #getHolderID() <em>Holder ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHolderID()
     * @generated
     * @ordered
     */
    protected static final String HOLDER_ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHolderID() <em>Holder ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHolderID()
     * @generated
     * @ordered
     */
    protected String holderID = HOLDER_ID_EDEFAULT;

    /**
     * This is true if the Holder ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean holderIDESet;

    /**
     * The default value of the '{@link #getHolderName() <em>Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHolderName()
     * @generated
     * @ordered
     */
    protected static final String HOLDER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHolderName() <em>Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHolderName()
     * @generated
     * @ordered
     */
    protected String holderName = HOLDER_NAME_EDEFAULT;

    /**
     * This is true if the Holder Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean holderNameESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BankAccountDetailImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBankAccountDetail();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAccountNumber( String newAccountNumber ) {
        String oldAccountNumber = accountNumber;
        accountNumber = newAccountNumber;
        boolean oldAccountNumberESet = accountNumberESet;
        accountNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER,
                    oldAccountNumber, accountNumber, !oldAccountNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccountNumber() {
        String oldAccountNumber = accountNumber;
        boolean oldAccountNumberESet = accountNumberESet;
        accountNumber = ACCOUNT_NUMBER_EDEFAULT;
        accountNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER,
                    oldAccountNumber, ACCOUNT_NUMBER_EDEFAULT, oldAccountNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccountNumber() {
        return accountNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBankName() {
        return bankName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBankName( String newBankName ) {
        String oldBankName = bankName;
        bankName = newBankName;
        boolean oldBankNameESet = bankNameESet;
        bankNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BANK_ACCOUNT_DETAIL__BANK_NAME, oldBankName, bankName, !oldBankNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBankName() {
        String oldBankName = bankName;
        boolean oldBankNameESet = bankNameESet;
        bankName = BANK_NAME_EDEFAULT;
        bankNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BANK_ACCOUNT_DETAIL__BANK_NAME, oldBankName, BANK_NAME_EDEFAULT, oldBankNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBankName() {
        return bankNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBranchCode( String newBranchCode ) {
        String oldBranchCode = branchCode;
        branchCode = newBranchCode;
        boolean oldBranchCodeESet = branchCodeESet;
        branchCodeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE, oldBranchCode, branchCode, !oldBranchCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBranchCode() {
        String oldBranchCode = branchCode;
        boolean oldBranchCodeESet = branchCodeESet;
        branchCode = BRANCH_CODE_EDEFAULT;
        branchCodeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE, oldBranchCode, BRANCH_CODE_EDEFAULT, oldBranchCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBranchCode() {
        return branchCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHolderID() {
        return holderID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHolderID( String newHolderID ) {
        String oldHolderID = holderID;
        holderID = newHolderID;
        boolean oldHolderIDESet = holderIDESet;
        holderIDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID, oldHolderID, holderID, !oldHolderIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHolderID() {
        String oldHolderID = holderID;
        boolean oldHolderIDESet = holderIDESet;
        holderID = HOLDER_ID_EDEFAULT;
        holderIDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID, oldHolderID, HOLDER_ID_EDEFAULT, oldHolderIDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHolderID() {
        return holderIDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getHolderName() {
        return holderName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHolderName( String newHolderName ) {
        String oldHolderName = holderName;
        holderName = newHolderName;
        boolean oldHolderNameESet = holderNameESet;
        holderNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME, oldHolderName, holderName, !oldHolderNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHolderName() {
        String oldHolderName = holderName;
        boolean oldHolderNameESet = holderNameESet;
        holderName = HOLDER_NAME_EDEFAULT;
        holderNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME, oldHolderName, HOLDER_NAME_EDEFAULT, oldHolderNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHolderName() {
        return holderNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
            return getAccountNumber();
        case CimPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
            return getBankName();
        case CimPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
            return getBranchCode();
        case CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
            return getHolderID();
        case CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
            return getHolderName();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
            setAccountNumber( ( String ) newValue );
            return;
        case CimPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
            setBankName( ( String ) newValue );
            return;
        case CimPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
            setBranchCode( ( String ) newValue );
            return;
        case CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
            setHolderID( ( String ) newValue );
            return;
        case CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
            setHolderName( ( String ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
            unsetAccountNumber();
            return;
        case CimPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
            unsetBankName();
            return;
        case CimPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
            unsetBranchCode();
            return;
        case CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
            unsetHolderID();
            return;
        case CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
            unsetHolderName();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.BANK_ACCOUNT_DETAIL__ACCOUNT_NUMBER:
            return isSetAccountNumber();
        case CimPackage.BANK_ACCOUNT_DETAIL__BANK_NAME:
            return isSetBankName();
        case CimPackage.BANK_ACCOUNT_DETAIL__BRANCH_CODE:
            return isSetBranchCode();
        case CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_ID:
            return isSetHolderID();
        case CimPackage.BANK_ACCOUNT_DETAIL__HOLDER_NAME:
            return isSetHolderName();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (accountNumber: " );
        if( accountNumberESet )
            result.append( accountNumber );
        else
            result.append( "<unset>" );
        result.append( ", bankName: " );
        if( bankNameESet )
            result.append( bankName );
        else
            result.append( "<unset>" );
        result.append( ", branchCode: " );
        if( branchCodeESet )
            result.append( branchCode );
        else
            result.append( "<unset>" );
        result.append( ", holderID: " );
        if( holderIDESet )
            result.append( holderID );
        else
            result.append( "<unset>" );
        result.append( ", holderName: " );
        if( holderNameESet )
            result.append( holderName );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BankAccountDetailImpl
