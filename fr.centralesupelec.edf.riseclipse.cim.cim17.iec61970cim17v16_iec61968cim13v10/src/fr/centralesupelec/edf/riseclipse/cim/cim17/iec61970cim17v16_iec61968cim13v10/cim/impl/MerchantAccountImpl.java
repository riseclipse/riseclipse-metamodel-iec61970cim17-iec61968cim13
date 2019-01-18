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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MerchantAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transactor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merchant Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MerchantAccountImpl#getCurrentBalance <em>Current Balance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MerchantAccountImpl#getProvisionalBalance <em>Provisional Balance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MerchantAccountImpl#getMerchantAgreement <em>Merchant Agreement</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MerchantAccountImpl#getTransactors <em>Transactors</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MerchantAccountImpl#getVendorShifts <em>Vendor Shifts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MerchantAccountImpl extends DocumentImpl implements MerchantAccount {
    /**
     * The default value of the '{@link #getCurrentBalance() <em>Current Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentBalance()
     * @generated
     * @ordered
     */
    protected static final BigDecimal CURRENT_BALANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentBalance() <em>Current Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentBalance()
     * @generated
     * @ordered
     */
    protected BigDecimal currentBalance = CURRENT_BALANCE_EDEFAULT;

    /**
     * This is true if the Current Balance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentBalanceESet;

    /**
     * The default value of the '{@link #getProvisionalBalance() <em>Provisional Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvisionalBalance()
     * @generated
     * @ordered
     */
    protected static final BigDecimal PROVISIONAL_BALANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProvisionalBalance() <em>Provisional Balance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProvisionalBalance()
     * @generated
     * @ordered
     */
    protected BigDecimal provisionalBalance = PROVISIONAL_BALANCE_EDEFAULT;

    /**
     * This is true if the Provisional Balance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean provisionalBalanceESet;

    /**
     * The cached value of the '{@link #getMerchantAgreement() <em>Merchant Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMerchantAgreement()
     * @generated
     * @ordered
     */
    protected MerchantAgreement merchantAgreement;

    /**
     * This is true if the Merchant Agreement reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean merchantAgreementESet;

    /**
     * The cached value of the '{@link #getTransactors() <em>Transactors</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactors()
     * @generated
     * @ordered
     */
    protected EList< Transactor > transactors;

    /**
     * The cached value of the '{@link #getVendorShifts() <em>Vendor Shifts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendorShifts()
     * @generated
     * @ordered
     */
    protected EList< VendorShift > vendorShifts;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MerchantAccountImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMerchantAccount();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentBalance( BigDecimal newCurrentBalance ) {
        BigDecimal oldCurrentBalance = currentBalance;
        currentBalance = newCurrentBalance;
        boolean oldCurrentBalanceESet = currentBalanceESet;
        currentBalanceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE,
                    oldCurrentBalance, currentBalance, !oldCurrentBalanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrentBalance() {
        BigDecimal oldCurrentBalance = currentBalance;
        boolean oldCurrentBalanceESet = currentBalanceESet;
        currentBalance = CURRENT_BALANCE_EDEFAULT;
        currentBalanceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE,
                    oldCurrentBalance, CURRENT_BALANCE_EDEFAULT, oldCurrentBalanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrentBalance() {
        return currentBalanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getProvisionalBalance() {
        return provisionalBalance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProvisionalBalance( BigDecimal newProvisionalBalance ) {
        BigDecimal oldProvisionalBalance = provisionalBalance;
        provisionalBalance = newProvisionalBalance;
        boolean oldProvisionalBalanceESet = provisionalBalanceESet;
        provisionalBalanceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE,
                    oldProvisionalBalance, provisionalBalance, !oldProvisionalBalanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProvisionalBalance() {
        BigDecimal oldProvisionalBalance = provisionalBalance;
        boolean oldProvisionalBalanceESet = provisionalBalanceESet;
        provisionalBalance = PROVISIONAL_BALANCE_EDEFAULT;
        provisionalBalanceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE,
                    oldProvisionalBalance, PROVISIONAL_BALANCE_EDEFAULT, oldProvisionalBalanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProvisionalBalance() {
        return provisionalBalanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MerchantAgreement getMerchantAgreement() {
        return merchantAgreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMerchantAgreement( MerchantAgreement newMerchantAgreement,
            NotificationChain msgs ) {
        MerchantAgreement oldMerchantAgreement = merchantAgreement;
        merchantAgreement = newMerchantAgreement;
        boolean oldMerchantAgreementESet = merchantAgreementESet;
        merchantAgreementESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT, oldMerchantAgreement, newMerchantAgreement,
                    !oldMerchantAgreementESet );
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
    public void setMerchantAgreement( MerchantAgreement newMerchantAgreement ) {
        if( newMerchantAgreement != merchantAgreement ) {
            NotificationChain msgs = null;
            if( merchantAgreement != null ) msgs = ( ( InternalEObject ) merchantAgreement ).eInverseRemove( this,
                    CimPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs );
            if( newMerchantAgreement != null ) msgs = ( ( InternalEObject ) newMerchantAgreement ).eInverseAdd( this,
                    CimPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs );
            msgs = basicSetMerchantAgreement( newMerchantAgreement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMerchantAgreementESet = merchantAgreementESet;
            merchantAgreementESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT,
                        newMerchantAgreement, newMerchantAgreement, !oldMerchantAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMerchantAgreement( NotificationChain msgs ) {
        MerchantAgreement oldMerchantAgreement = merchantAgreement;
        merchantAgreement = null;
        boolean oldMerchantAgreementESet = merchantAgreementESet;
        merchantAgreementESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT, oldMerchantAgreement, null,
                    oldMerchantAgreementESet );
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
    public void unsetMerchantAgreement() {
        if( merchantAgreement != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) merchantAgreement ).eInverseRemove( this,
                    CimPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs );
            msgs = basicUnsetMerchantAgreement( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMerchantAgreementESet = merchantAgreementESet;
            merchantAgreementESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT, null, null, oldMerchantAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMerchantAgreement() {
        return merchantAgreementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Transactor > getTransactors() {
        if( transactors == null ) {
            transactors = new EObjectWithInverseEList.Unsettable.ManyInverse< Transactor >( Transactor.class, this,
                    CimPackage.MERCHANT_ACCOUNT__TRANSACTORS, CimPackage.TRANSACTOR__MERCHANT_ACCOUNTS );
        }
        return transactors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransactors() {
        if( transactors != null ) ( ( InternalEList.Unsettable< ? > ) transactors ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransactors() {
        return transactors != null && ( ( InternalEList.Unsettable< ? > ) transactors ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< VendorShift > getVendorShifts() {
        if( vendorShifts == null ) {
            vendorShifts = new EObjectWithInverseResolvingEList.Unsettable< VendorShift >( VendorShift.class, this,
                    CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS, CimPackage.VENDOR_SHIFT__MERCHANT_ACCOUNT );
        }
        return vendorShifts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVendorShifts() {
        if( vendorShifts != null ) ( ( InternalEList.Unsettable< ? > ) vendorShifts ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVendorShifts() {
        return vendorShifts != null && ( ( InternalEList.Unsettable< ? > ) vendorShifts ).isSet();
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
        case CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
            if( merchantAgreement != null ) msgs = ( ( InternalEObject ) merchantAgreement ).eInverseRemove( this,
                    CimPackage.MERCHANT_AGREEMENT__MERCHANT_ACCOUNTS, MerchantAgreement.class, msgs );
            return basicSetMerchantAgreement( ( MerchantAgreement ) otherEnd, msgs );
        case CimPackage.MERCHANT_ACCOUNT__TRANSACTORS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransactors() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getVendorShifts() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
            return basicUnsetMerchantAgreement( msgs );
        case CimPackage.MERCHANT_ACCOUNT__TRANSACTORS:
            return ( ( InternalEList< ? > ) getTransactors() ).basicRemove( otherEnd, msgs );
        case CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
            return ( ( InternalEList< ? > ) getVendorShifts() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
            return getCurrentBalance();
        case CimPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
            return getProvisionalBalance();
        case CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
            return getMerchantAgreement();
        case CimPackage.MERCHANT_ACCOUNT__TRANSACTORS:
            return getTransactors();
        case CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
            return getVendorShifts();
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
        case CimPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
            setCurrentBalance( ( BigDecimal ) newValue );
            return;
        case CimPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
            setProvisionalBalance( ( BigDecimal ) newValue );
            return;
        case CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
            setMerchantAgreement( ( MerchantAgreement ) newValue );
            return;
        case CimPackage.MERCHANT_ACCOUNT__TRANSACTORS:
            getTransactors().clear();
            getTransactors().addAll( ( Collection< ? extends Transactor > ) newValue );
            return;
        case CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
            getVendorShifts().clear();
            getVendorShifts().addAll( ( Collection< ? extends VendorShift > ) newValue );
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
        case CimPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
            unsetCurrentBalance();
            return;
        case CimPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
            unsetProvisionalBalance();
            return;
        case CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
            unsetMerchantAgreement();
            return;
        case CimPackage.MERCHANT_ACCOUNT__TRANSACTORS:
            unsetTransactors();
            return;
        case CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
            unsetVendorShifts();
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
        case CimPackage.MERCHANT_ACCOUNT__CURRENT_BALANCE:
            return isSetCurrentBalance();
        case CimPackage.MERCHANT_ACCOUNT__PROVISIONAL_BALANCE:
            return isSetProvisionalBalance();
        case CimPackage.MERCHANT_ACCOUNT__MERCHANT_AGREEMENT:
            return isSetMerchantAgreement();
        case CimPackage.MERCHANT_ACCOUNT__TRANSACTORS:
            return isSetTransactors();
        case CimPackage.MERCHANT_ACCOUNT__VENDOR_SHIFTS:
            return isSetVendorShifts();
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
        result.append( " (currentBalance: " );
        if( currentBalanceESet )
            result.append( currentBalance );
        else
            result.append( "<unset>" );
        result.append( ", provisionalBalance: " );
        if( provisionalBalanceESet )
            result.append( provisionalBalance );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MerchantAccountImpl
