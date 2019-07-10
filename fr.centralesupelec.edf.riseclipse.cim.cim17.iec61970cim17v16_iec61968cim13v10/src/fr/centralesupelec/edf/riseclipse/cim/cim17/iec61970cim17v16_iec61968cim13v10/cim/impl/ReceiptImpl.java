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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LineDetail;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tender;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VendorShift;

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
 * An implementation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReceiptImpl#getIsBankable <em>Is Bankable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReceiptImpl#getLine <em>Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReceiptImpl#getTenders <em>Tenders</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReceiptImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReceiptImpl#getVendorShift <em>Vendor Shift</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReceiptImpl#getCashierShift <em>Cashier Shift</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiptImpl extends IdentifiedObjectImpl implements Receipt {
    /**
     * The default value of the '{@link #getIsBankable() <em>Is Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsBankable()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_BANKABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsBankable() <em>Is Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsBankable()
     * @generated
     * @ordered
     */
    protected Boolean isBankable = IS_BANKABLE_EDEFAULT;

    /**
     * This is true if the Is Bankable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isBankableESet;

    /**
     * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLine()
     * @generated
     * @ordered
     */
    protected LineDetail line;

    /**
     * This is true if the Line containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineESet;

    /**
     * The cached value of the '{@link #getTenders() <em>Tenders</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTenders()
     * @generated
     * @ordered
     */
    protected EList< Tender > tenders;

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
     * The cached value of the '{@link #getVendorShift() <em>Vendor Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVendorShift()
     * @generated
     * @ordered
     */
    protected VendorShift vendorShift;

    /**
     * This is true if the Vendor Shift reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vendorShiftESet;

    /**
     * The cached value of the '{@link #getCashierShift() <em>Cashier Shift</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCashierShift()
     * @generated
     * @ordered
     */
    protected CashierShift cashierShift;

    /**
     * This is true if the Cashier Shift reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cashierShiftESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReceiptImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReceipt();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsBankable() {
        return isBankable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsBankable( Boolean newIsBankable ) {
        Boolean oldIsBankable = isBankable;
        isBankable = newIsBankable;
        boolean oldIsBankableESet = isBankableESet;
        isBankableESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.RECEIPT__IS_BANKABLE, oldIsBankable, isBankable, !oldIsBankableESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsBankable() {
        Boolean oldIsBankable = isBankable;
        boolean oldIsBankableESet = isBankableESet;
        isBankable = IS_BANKABLE_EDEFAULT;
        isBankableESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.RECEIPT__IS_BANKABLE, oldIsBankable, IS_BANKABLE_EDEFAULT, oldIsBankableESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsBankable() {
        return isBankableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LineDetail getLine() {
        return line;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLine( LineDetail newLine, NotificationChain msgs ) {
        LineDetail oldLine = line;
        line = newLine;
        boolean oldLineESet = lineESet;
        lineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.RECEIPT__LINE,
                    oldLine, newLine, !oldLineESet );
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
    public void setLine( LineDetail newLine ) {
        if( newLine != line ) {
            NotificationChain msgs = null;
            if( line != null ) msgs = ( ( InternalEObject ) line ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.RECEIPT__LINE, null, msgs );
            if( newLine != null ) msgs = ( ( InternalEObject ) newLine ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.RECEIPT__LINE, null, msgs );
            msgs = basicSetLine( newLine, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLineESet = lineESet;
            lineESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.RECEIPT__LINE, newLine, newLine, !oldLineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLine( NotificationChain msgs ) {
        LineDetail oldLine = line;
        line = null;
        boolean oldLineESet = lineESet;
        lineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.RECEIPT__LINE,
                    oldLine, null, oldLineESet );
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
    public void unsetLine() {
        if( line != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) line ).eInverseRemove( this, EOPPOSITE_FEATURE_BASE - CimPackage.RECEIPT__LINE,
                    null, msgs );
            msgs = basicUnsetLine( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLineESet = lineESet;
            lineESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RECEIPT__LINE, null, null, oldLineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLine() {
        return lineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Tender > getTenders() {
        if( tenders == null ) {
            tenders = new EObjectWithInverseResolvingEList.Unsettable< Tender >( Tender.class, this,
                    CimPackage.RECEIPT__TENDERS, CimPackage.TENDER__RECEIPT );
        }
        return tenders;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTenders() {
        if( tenders != null ) ( ( InternalEList.Unsettable< ? > ) tenders ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTenders() {
        return tenders != null && ( ( InternalEList.Unsettable< ? > ) tenders ).isSet();
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
                    CimPackage.RECEIPT__TRANSACTIONS, CimPackage.TRANSACTION__RECEIPT );
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
    public VendorShift getVendorShift() {
        return vendorShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVendorShift( VendorShift newVendorShift, NotificationChain msgs ) {
        VendorShift oldVendorShift = vendorShift;
        vendorShift = newVendorShift;
        boolean oldVendorShiftESet = vendorShiftESet;
        vendorShiftESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.RECEIPT__VENDOR_SHIFT, oldVendorShift, newVendorShift, !oldVendorShiftESet );
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
    public void setVendorShift( VendorShift newVendorShift ) {
        if( newVendorShift != vendorShift ) {
            NotificationChain msgs = null;
            if( vendorShift != null ) msgs = ( ( InternalEObject ) vendorShift ).eInverseRemove( this,
                    CimPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs );
            if( newVendorShift != null ) msgs = ( ( InternalEObject ) newVendorShift ).eInverseAdd( this,
                    CimPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs );
            msgs = basicSetVendorShift( newVendorShift, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVendorShiftESet = vendorShiftESet;
            vendorShiftESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.RECEIPT__VENDOR_SHIFT, newVendorShift, newVendorShift, !oldVendorShiftESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVendorShift( NotificationChain msgs ) {
        VendorShift oldVendorShift = vendorShift;
        vendorShift = null;
        boolean oldVendorShiftESet = vendorShiftESet;
        vendorShiftESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RECEIPT__VENDOR_SHIFT, oldVendorShift, null, oldVendorShiftESet );
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
    public void unsetVendorShift() {
        if( vendorShift != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) vendorShift ).eInverseRemove( this, CimPackage.VENDOR_SHIFT__RECEIPTS,
                    VendorShift.class, msgs );
            msgs = basicUnsetVendorShift( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVendorShiftESet = vendorShiftESet;
            vendorShiftESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RECEIPT__VENDOR_SHIFT, null, null, oldVendorShiftESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVendorShift() {
        return vendorShiftESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CashierShift getCashierShift() {
        return cashierShift;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCashierShift( CashierShift newCashierShift, NotificationChain msgs ) {
        CashierShift oldCashierShift = cashierShift;
        cashierShift = newCashierShift;
        boolean oldCashierShiftESet = cashierShiftESet;
        cashierShiftESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.RECEIPT__CASHIER_SHIFT, oldCashierShift, newCashierShift, !oldCashierShiftESet );
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
    public void setCashierShift( CashierShift newCashierShift ) {
        if( newCashierShift != cashierShift ) {
            NotificationChain msgs = null;
            if( cashierShift != null ) msgs = ( ( InternalEObject ) cashierShift ).eInverseRemove( this,
                    CimPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs );
            if( newCashierShift != null ) msgs = ( ( InternalEObject ) newCashierShift ).eInverseAdd( this,
                    CimPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs );
            msgs = basicSetCashierShift( newCashierShift, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCashierShiftESet = cashierShiftESet;
            cashierShiftESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.RECEIPT__CASHIER_SHIFT, newCashierShift, newCashierShift, !oldCashierShiftESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCashierShift( NotificationChain msgs ) {
        CashierShift oldCashierShift = cashierShift;
        cashierShift = null;
        boolean oldCashierShiftESet = cashierShiftESet;
        cashierShiftESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RECEIPT__CASHIER_SHIFT, oldCashierShift, null, oldCashierShiftESet );
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
    public void unsetCashierShift() {
        if( cashierShift != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cashierShift ).eInverseRemove( this, CimPackage.CASHIER_SHIFT__RECEIPTS,
                    CashierShift.class, msgs );
            msgs = basicUnsetCashierShift( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCashierShiftESet = cashierShiftESet;
            cashierShiftESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RECEIPT__CASHIER_SHIFT, null, null, oldCashierShiftESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCashierShift() {
        return cashierShiftESet;
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
        case CimPackage.RECEIPT__TENDERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTenders() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.RECEIPT__TRANSACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransactions() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.RECEIPT__VENDOR_SHIFT:
            if( vendorShift != null ) msgs = ( ( InternalEObject ) vendorShift ).eInverseRemove( this,
                    CimPackage.VENDOR_SHIFT__RECEIPTS, VendorShift.class, msgs );
            return basicSetVendorShift( ( VendorShift ) otherEnd, msgs );
        case CimPackage.RECEIPT__CASHIER_SHIFT:
            if( cashierShift != null ) msgs = ( ( InternalEObject ) cashierShift ).eInverseRemove( this,
                    CimPackage.CASHIER_SHIFT__RECEIPTS, CashierShift.class, msgs );
            return basicSetCashierShift( ( CashierShift ) otherEnd, msgs );
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
        case CimPackage.RECEIPT__LINE:
            return basicUnsetLine( msgs );
        case CimPackage.RECEIPT__TENDERS:
            return ( ( InternalEList< ? > ) getTenders() ).basicRemove( otherEnd, msgs );
        case CimPackage.RECEIPT__TRANSACTIONS:
            return ( ( InternalEList< ? > ) getTransactions() ).basicRemove( otherEnd, msgs );
        case CimPackage.RECEIPT__VENDOR_SHIFT:
            return basicUnsetVendorShift( msgs );
        case CimPackage.RECEIPT__CASHIER_SHIFT:
            return basicUnsetCashierShift( msgs );
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
        case CimPackage.RECEIPT__IS_BANKABLE:
            return getIsBankable();
        case CimPackage.RECEIPT__LINE:
            return getLine();
        case CimPackage.RECEIPT__TENDERS:
            return getTenders();
        case CimPackage.RECEIPT__TRANSACTIONS:
            return getTransactions();
        case CimPackage.RECEIPT__VENDOR_SHIFT:
            return getVendorShift();
        case CimPackage.RECEIPT__CASHIER_SHIFT:
            return getCashierShift();
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
        case CimPackage.RECEIPT__IS_BANKABLE:
            setIsBankable( ( Boolean ) newValue );
            return;
        case CimPackage.RECEIPT__LINE:
            setLine( ( LineDetail ) newValue );
            return;
        case CimPackage.RECEIPT__TENDERS:
            getTenders().clear();
            getTenders().addAll( ( Collection< ? extends Tender > ) newValue );
            return;
        case CimPackage.RECEIPT__TRANSACTIONS:
            getTransactions().clear();
            getTransactions().addAll( ( Collection< ? extends Transaction > ) newValue );
            return;
        case CimPackage.RECEIPT__VENDOR_SHIFT:
            setVendorShift( ( VendorShift ) newValue );
            return;
        case CimPackage.RECEIPT__CASHIER_SHIFT:
            setCashierShift( ( CashierShift ) newValue );
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
        case CimPackage.RECEIPT__IS_BANKABLE:
            unsetIsBankable();
            return;
        case CimPackage.RECEIPT__LINE:
            unsetLine();
            return;
        case CimPackage.RECEIPT__TENDERS:
            unsetTenders();
            return;
        case CimPackage.RECEIPT__TRANSACTIONS:
            unsetTransactions();
            return;
        case CimPackage.RECEIPT__VENDOR_SHIFT:
            unsetVendorShift();
            return;
        case CimPackage.RECEIPT__CASHIER_SHIFT:
            unsetCashierShift();
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
        case CimPackage.RECEIPT__IS_BANKABLE:
            return isSetIsBankable();
        case CimPackage.RECEIPT__LINE:
            return isSetLine();
        case CimPackage.RECEIPT__TENDERS:
            return isSetTenders();
        case CimPackage.RECEIPT__TRANSACTIONS:
            return isSetTransactions();
        case CimPackage.RECEIPT__VENDOR_SHIFT:
            return isSetVendorShift();
        case CimPackage.RECEIPT__CASHIER_SHIFT:
            return isSetCashierShift();
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
        result.append( " (isBankable: " );
        if( isBankableESet )
            result.append( isBankable );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ReceiptImpl
