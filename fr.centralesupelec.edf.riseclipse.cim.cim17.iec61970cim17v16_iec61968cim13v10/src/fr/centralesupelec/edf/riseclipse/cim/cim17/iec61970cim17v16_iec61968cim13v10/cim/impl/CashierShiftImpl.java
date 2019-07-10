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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Cashier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CashierShift;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PointOfSale;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Receipt;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Transaction;

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
 * An implementation of the model object '<em><b>Cashier Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CashierShiftImpl#getCashFloat <em>Cash Float</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CashierShiftImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CashierShiftImpl#getCashier <em>Cashier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CashierShiftImpl#getPointOfSale <em>Point Of Sale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CashierShiftImpl#getReceipts <em>Receipts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CashierShiftImpl extends ShiftImpl implements CashierShift {
    /**
     * The default value of the '{@link #getCashFloat() <em>Cash Float</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCashFloat()
     * @generated
     * @ordered
     */
    protected static final BigDecimal CASH_FLOAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCashFloat() <em>Cash Float</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCashFloat()
     * @generated
     * @ordered
     */
    protected BigDecimal cashFloat = CASH_FLOAT_EDEFAULT;

    /**
     * This is true if the Cash Float attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cashFloatESet;

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
     * The cached value of the '{@link #getCashier() <em>Cashier</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCashier()
     * @generated
     * @ordered
     */
    protected Cashier cashier;

    /**
     * This is true if the Cashier reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cashierESet;

    /**
     * The cached value of the '{@link #getPointOfSale() <em>Point Of Sale</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPointOfSale()
     * @generated
     * @ordered
     */
    protected PointOfSale pointOfSale;

    /**
     * This is true if the Point Of Sale reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pointOfSaleESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CashierShiftImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCashierShift();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getCashFloat() {
        return cashFloat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCashFloat( BigDecimal newCashFloat ) {
        BigDecimal oldCashFloat = cashFloat;
        cashFloat = newCashFloat;
        boolean oldCashFloatESet = cashFloatESet;
        cashFloatESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CASHIER_SHIFT__CASH_FLOAT, oldCashFloat, cashFloat, !oldCashFloatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCashFloat() {
        BigDecimal oldCashFloat = cashFloat;
        boolean oldCashFloatESet = cashFloatESet;
        cashFloat = CASH_FLOAT_EDEFAULT;
        cashFloatESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CASHIER_SHIFT__CASH_FLOAT, oldCashFloat, CASH_FLOAT_EDEFAULT, oldCashFloatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCashFloat() {
        return cashFloatESet;
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
                    CimPackage.CASHIER_SHIFT__TRANSACTIONS, CimPackage.TRANSACTION__CASHIER_SHIFT );
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
    public Cashier getCashier() {
        return cashier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCashier( Cashier newCashier, NotificationChain msgs ) {
        Cashier oldCashier = cashier;
        cashier = newCashier;
        boolean oldCashierESet = cashierESet;
        cashierESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CASHIER_SHIFT__CASHIER, oldCashier, newCashier, !oldCashierESet );
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
    public void setCashier( Cashier newCashier ) {
        if( newCashier != cashier ) {
            NotificationChain msgs = null;
            if( cashier != null ) msgs = ( ( InternalEObject ) cashier ).eInverseRemove( this,
                    CimPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs );
            if( newCashier != null ) msgs = ( ( InternalEObject ) newCashier ).eInverseAdd( this,
                    CimPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs );
            msgs = basicSetCashier( newCashier, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCashierESet = cashierESet;
            cashierESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CASHIER_SHIFT__CASHIER, newCashier, newCashier, !oldCashierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCashier( NotificationChain msgs ) {
        Cashier oldCashier = cashier;
        cashier = null;
        boolean oldCashierESet = cashierESet;
        cashierESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CASHIER_SHIFT__CASHIER, oldCashier, null, oldCashierESet );
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
    public void unsetCashier() {
        if( cashier != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cashier ).eInverseRemove( this, CimPackage.CASHIER__CASHIER_SHIFTS,
                    Cashier.class, msgs );
            msgs = basicUnsetCashier( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCashierESet = cashierESet;
            cashierESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CASHIER_SHIFT__CASHIER, null, null, oldCashierESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCashier() {
        return cashierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPointOfSale( PointOfSale newPointOfSale, NotificationChain msgs ) {
        PointOfSale oldPointOfSale = pointOfSale;
        pointOfSale = newPointOfSale;
        boolean oldPointOfSaleESet = pointOfSaleESet;
        pointOfSaleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CASHIER_SHIFT__POINT_OF_SALE, oldPointOfSale, newPointOfSale, !oldPointOfSaleESet );
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
    public void setPointOfSale( PointOfSale newPointOfSale ) {
        if( newPointOfSale != pointOfSale ) {
            NotificationChain msgs = null;
            if( pointOfSale != null ) msgs = ( ( InternalEObject ) pointOfSale ).eInverseRemove( this,
                    CimPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs );
            if( newPointOfSale != null ) msgs = ( ( InternalEObject ) newPointOfSale ).eInverseAdd( this,
                    CimPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs );
            msgs = basicSetPointOfSale( newPointOfSale, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPointOfSaleESet = pointOfSaleESet;
            pointOfSaleESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CASHIER_SHIFT__POINT_OF_SALE, newPointOfSale, newPointOfSale, !oldPointOfSaleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPointOfSale( NotificationChain msgs ) {
        PointOfSale oldPointOfSale = pointOfSale;
        pointOfSale = null;
        boolean oldPointOfSaleESet = pointOfSaleESet;
        pointOfSaleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CASHIER_SHIFT__POINT_OF_SALE, oldPointOfSale, null, oldPointOfSaleESet );
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
    public void unsetPointOfSale() {
        if( pointOfSale != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pointOfSale ).eInverseRemove( this, CimPackage.POINT_OF_SALE__CASHIER_SHIFTS,
                    PointOfSale.class, msgs );
            msgs = basicUnsetPointOfSale( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPointOfSaleESet = pointOfSaleESet;
            pointOfSaleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CASHIER_SHIFT__POINT_OF_SALE, null, null, oldPointOfSaleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPointOfSale() {
        return pointOfSaleESet;
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
                    CimPackage.CASHIER_SHIFT__RECEIPTS, CimPackage.RECEIPT__CASHIER_SHIFT );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CASHIER_SHIFT__TRANSACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransactions() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CASHIER_SHIFT__CASHIER:
            if( cashier != null ) msgs = ( ( InternalEObject ) cashier ).eInverseRemove( this,
                    CimPackage.CASHIER__CASHIER_SHIFTS, Cashier.class, msgs );
            return basicSetCashier( ( Cashier ) otherEnd, msgs );
        case CimPackage.CASHIER_SHIFT__POINT_OF_SALE:
            if( pointOfSale != null ) msgs = ( ( InternalEObject ) pointOfSale ).eInverseRemove( this,
                    CimPackage.POINT_OF_SALE__CASHIER_SHIFTS, PointOfSale.class, msgs );
            return basicSetPointOfSale( ( PointOfSale ) otherEnd, msgs );
        case CimPackage.CASHIER_SHIFT__RECEIPTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReceipts() ).basicAdd( otherEnd,
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
        case CimPackage.CASHIER_SHIFT__TRANSACTIONS:
            return ( ( InternalEList< ? > ) getTransactions() ).basicRemove( otherEnd, msgs );
        case CimPackage.CASHIER_SHIFT__CASHIER:
            return basicUnsetCashier( msgs );
        case CimPackage.CASHIER_SHIFT__POINT_OF_SALE:
            return basicUnsetPointOfSale( msgs );
        case CimPackage.CASHIER_SHIFT__RECEIPTS:
            return ( ( InternalEList< ? > ) getReceipts() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CASHIER_SHIFT__CASH_FLOAT:
            return getCashFloat();
        case CimPackage.CASHIER_SHIFT__TRANSACTIONS:
            return getTransactions();
        case CimPackage.CASHIER_SHIFT__CASHIER:
            return getCashier();
        case CimPackage.CASHIER_SHIFT__POINT_OF_SALE:
            return getPointOfSale();
        case CimPackage.CASHIER_SHIFT__RECEIPTS:
            return getReceipts();
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
        case CimPackage.CASHIER_SHIFT__CASH_FLOAT:
            setCashFloat( ( BigDecimal ) newValue );
            return;
        case CimPackage.CASHIER_SHIFT__TRANSACTIONS:
            getTransactions().clear();
            getTransactions().addAll( ( Collection< ? extends Transaction > ) newValue );
            return;
        case CimPackage.CASHIER_SHIFT__CASHIER:
            setCashier( ( Cashier ) newValue );
            return;
        case CimPackage.CASHIER_SHIFT__POINT_OF_SALE:
            setPointOfSale( ( PointOfSale ) newValue );
            return;
        case CimPackage.CASHIER_SHIFT__RECEIPTS:
            getReceipts().clear();
            getReceipts().addAll( ( Collection< ? extends Receipt > ) newValue );
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
        case CimPackage.CASHIER_SHIFT__CASH_FLOAT:
            unsetCashFloat();
            return;
        case CimPackage.CASHIER_SHIFT__TRANSACTIONS:
            unsetTransactions();
            return;
        case CimPackage.CASHIER_SHIFT__CASHIER:
            unsetCashier();
            return;
        case CimPackage.CASHIER_SHIFT__POINT_OF_SALE:
            unsetPointOfSale();
            return;
        case CimPackage.CASHIER_SHIFT__RECEIPTS:
            unsetReceipts();
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
        case CimPackage.CASHIER_SHIFT__CASH_FLOAT:
            return isSetCashFloat();
        case CimPackage.CASHIER_SHIFT__TRANSACTIONS:
            return isSetTransactions();
        case CimPackage.CASHIER_SHIFT__CASHIER:
            return isSetCashier();
        case CimPackage.CASHIER_SHIFT__POINT_OF_SALE:
            return isSetPointOfSale();
        case CimPackage.CASHIER_SHIFT__RECEIPTS:
            return isSetReceipts();
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
        result.append( " (cashFloat: " );
        if( cashFloatESet )
            result.append( cashFloat );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CashierShiftImpl
