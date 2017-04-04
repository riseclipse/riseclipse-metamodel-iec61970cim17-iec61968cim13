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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAccount;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Vendor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vendor Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VendorShiftImpl#getMerchantDebitAmount <em>Merchant Debit Amount</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VendorShiftImpl#getPosted <em>Posted</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VendorShiftImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VendorShiftImpl#getReceipts <em>Receipts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VendorShiftImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.VendorShiftImpl#getMerchantAccount <em>Merchant Account</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VendorShiftImpl extends ShiftImpl implements VendorShift {
    /**
     * The default value of the '{@link #getMerchantDebitAmount() <em>Merchant Debit Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMerchantDebitAmount()
     * @generated
     * @ordered
     */
    protected static final BigDecimal MERCHANT_DEBIT_AMOUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMerchantDebitAmount() <em>Merchant Debit Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMerchantDebitAmount()
     * @generated
     * @ordered
     */
    protected BigDecimal merchantDebitAmount = MERCHANT_DEBIT_AMOUNT_EDEFAULT;

    /**
     * This is true if the Merchant Debit Amount attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean merchantDebitAmountESet;

    /**
     * The default value of the '{@link #getPosted() <em>Posted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosted()
     * @generated
     * @ordered
     */
    protected static final Boolean POSTED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPosted() <em>Posted</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosted()
     * @generated
     * @ordered
     */
    protected Boolean posted = POSTED_EDEFAULT;

    /**
     * This is true if the Posted attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean postedESet;

    /**
     * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactions()
     * @generated
     * @ordered
     */
    protected EList< Transaction > transactions;

    /**
     * The cached value of the '{@link #getReceipts() <em>Receipts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceipts()
     * @generated
     * @ordered
     */
    protected EList< Receipt > receipts;

    /**
     * The cached value of the '{@link #getVendor() <em>Vendor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendor()
     * @generated
     * @ordered
     */
    protected Vendor vendor;

    /**
     * This is true if the Vendor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vendorESet;

    /**
     * The cached value of the '{@link #getMerchantAccount() <em>Merchant Account</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMerchantAccount()
     * @generated
     * @ordered
     */
    protected MerchantAccount merchantAccount;

    /**
     * This is true if the Merchant Account reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean merchantAccountESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VendorShiftImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVendorShift();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getMerchantDebitAmount() {
        return merchantDebitAmount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMerchantDebitAmount( BigDecimal newMerchantDebitAmount ) {
        BigDecimal oldMerchantDebitAmount = merchantDebitAmount;
        merchantDebitAmount = newMerchantDebitAmount;
        boolean oldMerchantDebitAmountESet = merchantDebitAmountESet;
        merchantDebitAmountESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT,
                    oldMerchantDebitAmount, merchantDebitAmount, !oldMerchantDebitAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMerchantDebitAmount() {
        BigDecimal oldMerchantDebitAmount = merchantDebitAmount;
        boolean oldMerchantDebitAmountESet = merchantDebitAmountESet;
        merchantDebitAmount = MERCHANT_DEBIT_AMOUNT_EDEFAULT;
        merchantDebitAmountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT,
                    oldMerchantDebitAmount, MERCHANT_DEBIT_AMOUNT_EDEFAULT, oldMerchantDebitAmountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMerchantDebitAmount() {
        return merchantDebitAmountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPosted() {
        return posted;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPosted( Boolean newPosted ) {
        Boolean oldPosted = posted;
        posted = newPosted;
        boolean oldPostedESet = postedESet;
        postedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.VENDOR_SHIFT__POSTED, oldPosted, posted, !oldPostedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPosted() {
        Boolean oldPosted = posted;
        boolean oldPostedESet = postedESet;
        posted = POSTED_EDEFAULT;
        postedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.VENDOR_SHIFT__POSTED, oldPosted, POSTED_EDEFAULT, oldPostedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPosted() {
        return postedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Transaction > getTransactions() {
        if( transactions == null ) {
            transactions = new EObjectWithInverseResolvingEList.Unsettable< Transaction >( Transaction.class, this,
                    CimPackage.VENDOR_SHIFT__TRANSACTIONS, CimPackage.TRANSACTION__VENDOR_SHIFT );
        }
        return transactions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransactions() {
        if( transactions != null ) ( ( InternalEList.Unsettable< ? > ) transactions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransactions() {
        return transactions != null && ( ( InternalEList.Unsettable< ? > ) transactions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Receipt > getReceipts() {
        if( receipts == null ) {
            receipts = new EObjectWithInverseResolvingEList.Unsettable< Receipt >( Receipt.class, this,
                    CimPackage.VENDOR_SHIFT__RECEIPTS, CimPackage.RECEIPT__VENDOR_SHIFT );
        }
        return receipts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReceipts() {
        if( receipts != null ) ( ( InternalEList.Unsettable< ? > ) receipts ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReceipts() {
        return receipts != null && ( ( InternalEList.Unsettable< ? > ) receipts ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVendor( Vendor newVendor, NotificationChain msgs ) {
        Vendor oldVendor = vendor;
        vendor = newVendor;
        boolean oldVendorESet = vendorESet;
        vendorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VENDOR_SHIFT__VENDOR, oldVendor, newVendor, !oldVendorESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVendor( Vendor newVendor ) {
        if( newVendor != vendor ) {
            NotificationChain msgs = null;
            if( vendor != null ) msgs = ( ( InternalEObject ) vendor ).eInverseRemove( this,
                    CimPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs );
            if( newVendor != null ) msgs = ( ( InternalEObject ) newVendor ).eInverseAdd( this,
                    CimPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs );
            msgs = basicSetVendor( newVendor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVendorESet = vendorESet;
            vendorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.VENDOR_SHIFT__VENDOR, newVendor, newVendor, !oldVendorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVendor( NotificationChain msgs ) {
        Vendor oldVendor = vendor;
        vendor = null;
        boolean oldVendorESet = vendorESet;
        vendorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VENDOR_SHIFT__VENDOR, oldVendor, null, oldVendorESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVendor() {
        if( vendor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) vendor ).eInverseRemove( this, CimPackage.VENDOR__VENDOR_SHIFTS, Vendor.class,
                    msgs );
            msgs = basicUnsetVendor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVendorESet = vendorESet;
            vendorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VENDOR_SHIFT__VENDOR, null, null, oldVendorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVendor() {
        return vendorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MerchantAccount getMerchantAccount() {
        return merchantAccount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMerchantAccount( MerchantAccount newMerchantAccount, NotificationChain msgs ) {
        MerchantAccount oldMerchantAccount = merchantAccount;
        merchantAccount = newMerchantAccount;
        boolean oldMerchantAccountESet = merchantAccountESet;
        merchantAccountESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT, oldMerchantAccount, newMerchantAccount,
                    !oldMerchantAccountESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMerchantAccount( MerchantAccount newMerchantAccount ) {
        if( newMerchantAccount != merchantAccount ) {
            NotificationChain msgs = null;
            if( merchantAccount != null ) msgs = ( ( InternalEObject ) merchantAccount ).eInverseRemove( this,
                    CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs );
            if( newMerchantAccount != null ) msgs = ( ( InternalEObject ) newMerchantAccount ).eInverseAdd( this,
                    CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs );
            msgs = basicSetMerchantAccount( newMerchantAccount, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMerchantAccountESet = merchantAccountESet;
            merchantAccountESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT,
                        newMerchantAccount, newMerchantAccount, !oldMerchantAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMerchantAccount( NotificationChain msgs ) {
        MerchantAccount oldMerchantAccount = merchantAccount;
        merchantAccount = null;
        boolean oldMerchantAccountESet = merchantAccountESet;
        merchantAccountESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT, oldMerchantAccount, null, oldMerchantAccountESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMerchantAccount() {
        if( merchantAccount != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) merchantAccount ).eInverseRemove( this,
                    CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs );
            msgs = basicUnsetMerchantAccount( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMerchantAccountESet = merchantAccountESet;
            merchantAccountESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT, null, null, oldMerchantAccountESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMerchantAccount() {
        return merchantAccountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.VENDOR_SHIFT__TRANSACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransactions() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.VENDOR_SHIFT__RECEIPTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReceipts() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.VENDOR_SHIFT__VENDOR:
            if( vendor != null ) msgs = ( ( InternalEObject ) vendor ).eInverseRemove( this,
                    CimPackage.VENDOR__VENDOR_SHIFTS, Vendor.class, msgs );
            return basicSetVendor( ( Vendor ) otherEnd, msgs );
        case CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
            if( merchantAccount != null ) msgs = ( ( InternalEObject ) merchantAccount ).eInverseRemove( this,
                    CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, MerchantAccount.class, msgs );
            return basicSetMerchantAccount( ( MerchantAccount ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.VENDOR_SHIFT__TRANSACTIONS:
            return ( ( InternalEList< ? > ) getTransactions() ).basicRemove( otherEnd, msgs );
        case CimPackage.VENDOR_SHIFT__RECEIPTS:
            return ( ( InternalEList< ? > ) getReceipts() ).basicRemove( otherEnd, msgs );
        case CimPackage.VENDOR_SHIFT__VENDOR:
            return basicUnsetVendor( msgs );
        case CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
            return basicUnsetMerchantAccount( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
            return getMerchantDebitAmount();
        case CimPackage.VENDOR_SHIFT__POSTED:
            return getPosted();
        case CimPackage.VENDOR_SHIFT__TRANSACTIONS:
            return getTransactions();
        case CimPackage.VENDOR_SHIFT__RECEIPTS:
            return getReceipts();
        case CimPackage.VENDOR_SHIFT__VENDOR:
            return getVendor();
        case CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
            return getMerchantAccount();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
            setMerchantDebitAmount( ( BigDecimal ) newValue );
            return;
        case CimPackage.VENDOR_SHIFT__POSTED:
            setPosted( ( Boolean ) newValue );
            return;
        case CimPackage.VENDOR_SHIFT__TRANSACTIONS:
            getTransactions().clear();
            getTransactions().addAll( ( Collection< ? extends Transaction > ) newValue );
            return;
        case CimPackage.VENDOR_SHIFT__RECEIPTS:
            getReceipts().clear();
            getReceipts().addAll( ( Collection< ? extends Receipt > ) newValue );
            return;
        case CimPackage.VENDOR_SHIFT__VENDOR:
            setVendor( ( Vendor ) newValue );
            return;
        case CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
            setMerchantAccount( ( MerchantAccount ) newValue );
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
        case CimPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
            unsetMerchantDebitAmount();
            return;
        case CimPackage.VENDOR_SHIFT__POSTED:
            unsetPosted();
            return;
        case CimPackage.VENDOR_SHIFT__TRANSACTIONS:
            unsetTransactions();
            return;
        case CimPackage.VENDOR_SHIFT__RECEIPTS:
            unsetReceipts();
            return;
        case CimPackage.VENDOR_SHIFT__VENDOR:
            unsetVendor();
            return;
        case CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
            unsetMerchantAccount();
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
        case CimPackage.VENDOR_SHIFT__MERCHANT_DEBIT_AMOUNT:
            return isSetMerchantDebitAmount();
        case CimPackage.VENDOR_SHIFT__POSTED:
            return isSetPosted();
        case CimPackage.VENDOR_SHIFT__TRANSACTIONS:
            return isSetTransactions();
        case CimPackage.VENDOR_SHIFT__RECEIPTS:
            return isSetReceipts();
        case CimPackage.VENDOR_SHIFT__VENDOR:
            return isSetVendor();
        case CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT:
            return isSetMerchantAccount();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (merchantDebitAmount: " );
        if( merchantDebitAmountESet )
            result.append( merchantDebitAmount );
        else
            result.append( "<unset>" );
        result.append( ", posted: " );
        if( postedESet )
            result.append( posted );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VendorShiftImpl
