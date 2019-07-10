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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Shift;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShiftImpl#getReceiptsGrandTotalBankable <em>Receipts Grand Total Bankable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShiftImpl#getReceiptsGrandTotalNonBankable <em>Receipts Grand Total Non Bankable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShiftImpl#getReceiptsGrandTotalRounding <em>Receipts Grand Total Rounding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShiftImpl#getTransactionsGrandTotal <em>Transactions Grand Total</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShiftImpl#getTransactionsGrandTotalRounding <em>Transactions Grand Total Rounding</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShiftImpl#getActivityInterval <em>Activity Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShiftImpl extends IdentifiedObjectImpl implements Shift {
    /**
     * The default value of the '{@link #getReceiptsGrandTotalBankable() <em>Receipts Grand Total Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiptsGrandTotalBankable()
     * @generated
     * @ordered
     */
    protected static final BigDecimal RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReceiptsGrandTotalBankable() <em>Receipts Grand Total Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiptsGrandTotalBankable()
     * @generated
     * @ordered
     */
    protected BigDecimal receiptsGrandTotalBankable = RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT;

    /**
     * This is true if the Receipts Grand Total Bankable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean receiptsGrandTotalBankableESet;

    /**
     * The default value of the '{@link #getReceiptsGrandTotalNonBankable() <em>Receipts Grand Total Non Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiptsGrandTotalNonBankable()
     * @generated
     * @ordered
     */
    protected static final BigDecimal RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReceiptsGrandTotalNonBankable() <em>Receipts Grand Total Non Bankable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiptsGrandTotalNonBankable()
     * @generated
     * @ordered
     */
    protected BigDecimal receiptsGrandTotalNonBankable = RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT;

    /**
     * This is true if the Receipts Grand Total Non Bankable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean receiptsGrandTotalNonBankableESet;

    /**
     * The default value of the '{@link #getReceiptsGrandTotalRounding() <em>Receipts Grand Total Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiptsGrandTotalRounding()
     * @generated
     * @ordered
     */
    protected static final BigDecimal RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReceiptsGrandTotalRounding() <em>Receipts Grand Total Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReceiptsGrandTotalRounding()
     * @generated
     * @ordered
     */
    protected BigDecimal receiptsGrandTotalRounding = RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT;

    /**
     * This is true if the Receipts Grand Total Rounding attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean receiptsGrandTotalRoundingESet;

    /**
     * The default value of the '{@link #getTransactionsGrandTotal() <em>Transactions Grand Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionsGrandTotal()
     * @generated
     * @ordered
     */
    protected static final BigDecimal TRANSACTIONS_GRAND_TOTAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransactionsGrandTotal() <em>Transactions Grand Total</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionsGrandTotal()
     * @generated
     * @ordered
     */
    protected BigDecimal transactionsGrandTotal = TRANSACTIONS_GRAND_TOTAL_EDEFAULT;

    /**
     * This is true if the Transactions Grand Total attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transactionsGrandTotalESet;

    /**
     * The default value of the '{@link #getTransactionsGrandTotalRounding() <em>Transactions Grand Total Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionsGrandTotalRounding()
     * @generated
     * @ordered
     */
    protected static final BigDecimal TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransactionsGrandTotalRounding() <em>Transactions Grand Total Rounding</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransactionsGrandTotalRounding()
     * @generated
     * @ordered
     */
    protected BigDecimal transactionsGrandTotalRounding = TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT;

    /**
     * This is true if the Transactions Grand Total Rounding attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transactionsGrandTotalRoundingESet;

    /**
     * The cached value of the '{@link #getActivityInterval() <em>Activity Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivityInterval()
     * @generated
     * @ordered
     */
    protected DateTimeInterval activityInterval;

    /**
     * This is true if the Activity Interval containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean activityIntervalESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShiftImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getShift();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getReceiptsGrandTotalBankable() {
        return receiptsGrandTotalBankable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReceiptsGrandTotalBankable( BigDecimal newReceiptsGrandTotalBankable ) {
        BigDecimal oldReceiptsGrandTotalBankable = receiptsGrandTotalBankable;
        receiptsGrandTotalBankable = newReceiptsGrandTotalBankable;
        boolean oldReceiptsGrandTotalBankableESet = receiptsGrandTotalBankableESet;
        receiptsGrandTotalBankableESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE,
                    oldReceiptsGrandTotalBankable, receiptsGrandTotalBankable, !oldReceiptsGrandTotalBankableESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReceiptsGrandTotalBankable() {
        BigDecimal oldReceiptsGrandTotalBankable = receiptsGrandTotalBankable;
        boolean oldReceiptsGrandTotalBankableESet = receiptsGrandTotalBankableESet;
        receiptsGrandTotalBankable = RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT;
        receiptsGrandTotalBankableESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE, oldReceiptsGrandTotalBankable,
                RECEIPTS_GRAND_TOTAL_BANKABLE_EDEFAULT, oldReceiptsGrandTotalBankableESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReceiptsGrandTotalBankable() {
        return receiptsGrandTotalBankableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getReceiptsGrandTotalNonBankable() {
        return receiptsGrandTotalNonBankable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReceiptsGrandTotalNonBankable( BigDecimal newReceiptsGrandTotalNonBankable ) {
        BigDecimal oldReceiptsGrandTotalNonBankable = receiptsGrandTotalNonBankable;
        receiptsGrandTotalNonBankable = newReceiptsGrandTotalNonBankable;
        boolean oldReceiptsGrandTotalNonBankableESet = receiptsGrandTotalNonBankableESet;
        receiptsGrandTotalNonBankableESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE, oldReceiptsGrandTotalNonBankable,
                receiptsGrandTotalNonBankable, !oldReceiptsGrandTotalNonBankableESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReceiptsGrandTotalNonBankable() {
        BigDecimal oldReceiptsGrandTotalNonBankable = receiptsGrandTotalNonBankable;
        boolean oldReceiptsGrandTotalNonBankableESet = receiptsGrandTotalNonBankableESet;
        receiptsGrandTotalNonBankable = RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT;
        receiptsGrandTotalNonBankableESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE, oldReceiptsGrandTotalNonBankable,
                RECEIPTS_GRAND_TOTAL_NON_BANKABLE_EDEFAULT, oldReceiptsGrandTotalNonBankableESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReceiptsGrandTotalNonBankable() {
        return receiptsGrandTotalNonBankableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getReceiptsGrandTotalRounding() {
        return receiptsGrandTotalRounding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReceiptsGrandTotalRounding( BigDecimal newReceiptsGrandTotalRounding ) {
        BigDecimal oldReceiptsGrandTotalRounding = receiptsGrandTotalRounding;
        receiptsGrandTotalRounding = newReceiptsGrandTotalRounding;
        boolean oldReceiptsGrandTotalRoundingESet = receiptsGrandTotalRoundingESet;
        receiptsGrandTotalRoundingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING,
                    oldReceiptsGrandTotalRounding, receiptsGrandTotalRounding, !oldReceiptsGrandTotalRoundingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReceiptsGrandTotalRounding() {
        BigDecimal oldReceiptsGrandTotalRounding = receiptsGrandTotalRounding;
        boolean oldReceiptsGrandTotalRoundingESet = receiptsGrandTotalRoundingESet;
        receiptsGrandTotalRounding = RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT;
        receiptsGrandTotalRoundingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING, oldReceiptsGrandTotalRounding,
                RECEIPTS_GRAND_TOTAL_ROUNDING_EDEFAULT, oldReceiptsGrandTotalRoundingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReceiptsGrandTotalRounding() {
        return receiptsGrandTotalRoundingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getTransactionsGrandTotal() {
        return transactionsGrandTotal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransactionsGrandTotal( BigDecimal newTransactionsGrandTotal ) {
        BigDecimal oldTransactionsGrandTotal = transactionsGrandTotal;
        transactionsGrandTotal = newTransactionsGrandTotal;
        boolean oldTransactionsGrandTotalESet = transactionsGrandTotalESet;
        transactionsGrandTotalESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL,
                    oldTransactionsGrandTotal, transactionsGrandTotal, !oldTransactionsGrandTotalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransactionsGrandTotal() {
        BigDecimal oldTransactionsGrandTotal = transactionsGrandTotal;
        boolean oldTransactionsGrandTotalESet = transactionsGrandTotalESet;
        transactionsGrandTotal = TRANSACTIONS_GRAND_TOTAL_EDEFAULT;
        transactionsGrandTotalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL,
                    oldTransactionsGrandTotal, TRANSACTIONS_GRAND_TOTAL_EDEFAULT, oldTransactionsGrandTotalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransactionsGrandTotal() {
        return transactionsGrandTotalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getTransactionsGrandTotalRounding() {
        return transactionsGrandTotalRounding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransactionsGrandTotalRounding( BigDecimal newTransactionsGrandTotalRounding ) {
        BigDecimal oldTransactionsGrandTotalRounding = transactionsGrandTotalRounding;
        transactionsGrandTotalRounding = newTransactionsGrandTotalRounding;
        boolean oldTransactionsGrandTotalRoundingESet = transactionsGrandTotalRoundingESet;
        transactionsGrandTotalRoundingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING, oldTransactionsGrandTotalRounding,
                transactionsGrandTotalRounding, !oldTransactionsGrandTotalRoundingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransactionsGrandTotalRounding() {
        BigDecimal oldTransactionsGrandTotalRounding = transactionsGrandTotalRounding;
        boolean oldTransactionsGrandTotalRoundingESet = transactionsGrandTotalRoundingESet;
        transactionsGrandTotalRounding = TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT;
        transactionsGrandTotalRoundingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING, oldTransactionsGrandTotalRounding,
                TRANSACTIONS_GRAND_TOTAL_ROUNDING_EDEFAULT, oldTransactionsGrandTotalRoundingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransactionsGrandTotalRounding() {
        return transactionsGrandTotalRoundingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getActivityInterval() {
        return activityInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetActivityInterval( DateTimeInterval newActivityInterval, NotificationChain msgs ) {
        DateTimeInterval oldActivityInterval = activityInterval;
        activityInterval = newActivityInterval;
        boolean oldActivityIntervalESet = activityIntervalESet;
        activityIntervalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SHIFT__ACTIVITY_INTERVAL, oldActivityInterval, newActivityInterval,
                    !oldActivityIntervalESet );
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
    public void setActivityInterval( DateTimeInterval newActivityInterval ) {
        if( newActivityInterval != activityInterval ) {
            NotificationChain msgs = null;
            if( activityInterval != null ) msgs = ( ( InternalEObject ) activityInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SHIFT__ACTIVITY_INTERVAL, null, msgs );
            if( newActivityInterval != null ) msgs = ( ( InternalEObject ) newActivityInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SHIFT__ACTIVITY_INTERVAL, null, msgs );
            msgs = basicSetActivityInterval( newActivityInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldActivityIntervalESet = activityIntervalESet;
            activityIntervalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHIFT__ACTIVITY_INTERVAL,
                        newActivityInterval, newActivityInterval, !oldActivityIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetActivityInterval( NotificationChain msgs ) {
        DateTimeInterval oldActivityInterval = activityInterval;
        activityInterval = null;
        boolean oldActivityIntervalESet = activityIntervalESet;
        activityIntervalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHIFT__ACTIVITY_INTERVAL, oldActivityInterval, null, oldActivityIntervalESet );
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
    public void unsetActivityInterval() {
        if( activityInterval != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) activityInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SHIFT__ACTIVITY_INTERVAL, null, msgs );
            msgs = basicUnsetActivityInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldActivityIntervalESet = activityIntervalESet;
            activityIntervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHIFT__ACTIVITY_INTERVAL, null, null, oldActivityIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActivityInterval() {
        return activityIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SHIFT__ACTIVITY_INTERVAL:
            return basicUnsetActivityInterval( msgs );
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
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
            return getReceiptsGrandTotalBankable();
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
            return getReceiptsGrandTotalNonBankable();
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
            return getReceiptsGrandTotalRounding();
        case CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
            return getTransactionsGrandTotal();
        case CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
            return getTransactionsGrandTotalRounding();
        case CimPackage.SHIFT__ACTIVITY_INTERVAL:
            return getActivityInterval();
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
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
            setReceiptsGrandTotalBankable( ( BigDecimal ) newValue );
            return;
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
            setReceiptsGrandTotalNonBankable( ( BigDecimal ) newValue );
            return;
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
            setReceiptsGrandTotalRounding( ( BigDecimal ) newValue );
            return;
        case CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
            setTransactionsGrandTotal( ( BigDecimal ) newValue );
            return;
        case CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
            setTransactionsGrandTotalRounding( ( BigDecimal ) newValue );
            return;
        case CimPackage.SHIFT__ACTIVITY_INTERVAL:
            setActivityInterval( ( DateTimeInterval ) newValue );
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
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
            unsetReceiptsGrandTotalBankable();
            return;
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
            unsetReceiptsGrandTotalNonBankable();
            return;
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
            unsetReceiptsGrandTotalRounding();
            return;
        case CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
            unsetTransactionsGrandTotal();
            return;
        case CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
            unsetTransactionsGrandTotalRounding();
            return;
        case CimPackage.SHIFT__ACTIVITY_INTERVAL:
            unsetActivityInterval();
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
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_BANKABLE:
            return isSetReceiptsGrandTotalBankable();
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_NON_BANKABLE:
            return isSetReceiptsGrandTotalNonBankable();
        case CimPackage.SHIFT__RECEIPTS_GRAND_TOTAL_ROUNDING:
            return isSetReceiptsGrandTotalRounding();
        case CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL:
            return isSetTransactionsGrandTotal();
        case CimPackage.SHIFT__TRANSACTIONS_GRAND_TOTAL_ROUNDING:
            return isSetTransactionsGrandTotalRounding();
        case CimPackage.SHIFT__ACTIVITY_INTERVAL:
            return isSetActivityInterval();
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
        result.append( " (receiptsGrandTotalBankable: " );
        if( receiptsGrandTotalBankableESet )
            result.append( receiptsGrandTotalBankable );
        else
            result.append( "<unset>" );
        result.append( ", receiptsGrandTotalNonBankable: " );
        if( receiptsGrandTotalNonBankableESet )
            result.append( receiptsGrandTotalNonBankable );
        else
            result.append( "<unset>" );
        result.append( ", receiptsGrandTotalRounding: " );
        if( receiptsGrandTotalRoundingESet )
            result.append( receiptsGrandTotalRounding );
        else
            result.append( "<unset>" );
        result.append( ", transactionsGrandTotal: " );
        if( transactionsGrandTotalESet )
            result.append( transactionsGrandTotal );
        else
            result.append( "<unset>" );
        result.append( ", transactionsGrandTotalRounding: " );
        if( transactionsGrandTotalRoundingESet )
            result.append( transactionsGrandTotalRounding );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ShiftImpl
