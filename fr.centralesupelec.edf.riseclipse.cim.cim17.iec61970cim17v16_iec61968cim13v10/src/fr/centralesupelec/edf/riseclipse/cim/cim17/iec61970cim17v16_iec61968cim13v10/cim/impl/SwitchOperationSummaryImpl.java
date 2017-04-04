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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchOperationSummary;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Operation Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchOperationSummaryImpl#getLifetimeFaultOperations <em>Lifetime Fault Operations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchOperationSummaryImpl#getLifetimeMotorStarts <em>Lifetime Motor Starts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchOperationSummaryImpl#getLifetimeTotalOperations <em>Lifetime Total Operations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchOperationSummaryImpl#getMostRecentFaultOperationDate <em>Most Recent Fault Operation Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchOperationSummaryImpl#getMostRecentMotorStartDate <em>Most Recent Motor Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchOperationSummaryImpl#getMostRecentOperationDate <em>Most Recent Operation Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchOperationSummaryImpl#getBreaker <em>Breaker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchOperationSummaryImpl extends IdentifiedObjectImpl implements SwitchOperationSummary {
    /**
     * The default value of the '{@link #getLifetimeFaultOperations() <em>Lifetime Fault Operations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifetimeFaultOperations()
     * @generated
     * @ordered
     */
    protected static final Integer LIFETIME_FAULT_OPERATIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLifetimeFaultOperations() <em>Lifetime Fault Operations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifetimeFaultOperations()
     * @generated
     * @ordered
     */
    protected Integer lifetimeFaultOperations = LIFETIME_FAULT_OPERATIONS_EDEFAULT;

    /**
     * This is true if the Lifetime Fault Operations attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lifetimeFaultOperationsESet;

    /**
     * The default value of the '{@link #getLifetimeMotorStarts() <em>Lifetime Motor Starts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifetimeMotorStarts()
     * @generated
     * @ordered
     */
    protected static final Integer LIFETIME_MOTOR_STARTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLifetimeMotorStarts() <em>Lifetime Motor Starts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifetimeMotorStarts()
     * @generated
     * @ordered
     */
    protected Integer lifetimeMotorStarts = LIFETIME_MOTOR_STARTS_EDEFAULT;

    /**
     * This is true if the Lifetime Motor Starts attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lifetimeMotorStartsESet;

    /**
     * The default value of the '{@link #getLifetimeTotalOperations() <em>Lifetime Total Operations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifetimeTotalOperations()
     * @generated
     * @ordered
     */
    protected static final Integer LIFETIME_TOTAL_OPERATIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLifetimeTotalOperations() <em>Lifetime Total Operations</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLifetimeTotalOperations()
     * @generated
     * @ordered
     */
    protected Integer lifetimeTotalOperations = LIFETIME_TOTAL_OPERATIONS_EDEFAULT;

    /**
     * This is true if the Lifetime Total Operations attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lifetimeTotalOperationsESet;

    /**
     * The default value of the '{@link #getMostRecentFaultOperationDate() <em>Most Recent Fault Operation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMostRecentFaultOperationDate()
     * @generated
     * @ordered
     */
    protected static final Date MOST_RECENT_FAULT_OPERATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMostRecentFaultOperationDate() <em>Most Recent Fault Operation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMostRecentFaultOperationDate()
     * @generated
     * @ordered
     */
    protected Date mostRecentFaultOperationDate = MOST_RECENT_FAULT_OPERATION_DATE_EDEFAULT;

    /**
     * This is true if the Most Recent Fault Operation Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mostRecentFaultOperationDateESet;

    /**
     * The default value of the '{@link #getMostRecentMotorStartDate() <em>Most Recent Motor Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMostRecentMotorStartDate()
     * @generated
     * @ordered
     */
    protected static final Date MOST_RECENT_MOTOR_START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMostRecentMotorStartDate() <em>Most Recent Motor Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMostRecentMotorStartDate()
     * @generated
     * @ordered
     */
    protected Date mostRecentMotorStartDate = MOST_RECENT_MOTOR_START_DATE_EDEFAULT;

    /**
     * This is true if the Most Recent Motor Start Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mostRecentMotorStartDateESet;

    /**
     * The default value of the '{@link #getMostRecentOperationDate() <em>Most Recent Operation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMostRecentOperationDate()
     * @generated
     * @ordered
     */
    protected static final Date MOST_RECENT_OPERATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMostRecentOperationDate() <em>Most Recent Operation Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMostRecentOperationDate()
     * @generated
     * @ordered
     */
    protected Date mostRecentOperationDate = MOST_RECENT_OPERATION_DATE_EDEFAULT;

    /**
     * This is true if the Most Recent Operation Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mostRecentOperationDateESet;

    /**
     * The cached value of the '{@link #getBreaker() <em>Breaker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBreaker()
     * @generated
     * @ordered
     */
    protected Asset breaker;

    /**
     * This is true if the Breaker reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean breakerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchOperationSummaryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchOperationSummary();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getLifetimeFaultOperations() {
        return lifetimeFaultOperations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLifetimeFaultOperations( Integer newLifetimeFaultOperations ) {
        Integer oldLifetimeFaultOperations = lifetimeFaultOperations;
        lifetimeFaultOperations = newLifetimeFaultOperations;
        boolean oldLifetimeFaultOperationsESet = lifetimeFaultOperationsESet;
        lifetimeFaultOperationsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_FAULT_OPERATIONS, oldLifetimeFaultOperations,
                lifetimeFaultOperations, !oldLifetimeFaultOperationsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLifetimeFaultOperations() {
        Integer oldLifetimeFaultOperations = lifetimeFaultOperations;
        boolean oldLifetimeFaultOperationsESet = lifetimeFaultOperationsESet;
        lifetimeFaultOperations = LIFETIME_FAULT_OPERATIONS_EDEFAULT;
        lifetimeFaultOperationsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_FAULT_OPERATIONS, oldLifetimeFaultOperations,
                LIFETIME_FAULT_OPERATIONS_EDEFAULT, oldLifetimeFaultOperationsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLifetimeFaultOperations() {
        return lifetimeFaultOperationsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getLifetimeMotorStarts() {
        return lifetimeMotorStarts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLifetimeMotorStarts( Integer newLifetimeMotorStarts ) {
        Integer oldLifetimeMotorStarts = lifetimeMotorStarts;
        lifetimeMotorStarts = newLifetimeMotorStarts;
        boolean oldLifetimeMotorStartsESet = lifetimeMotorStartsESet;
        lifetimeMotorStartsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_MOTOR_STARTS, oldLifetimeMotorStarts, lifetimeMotorStarts,
                !oldLifetimeMotorStartsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLifetimeMotorStarts() {
        Integer oldLifetimeMotorStarts = lifetimeMotorStarts;
        boolean oldLifetimeMotorStartsESet = lifetimeMotorStartsESet;
        lifetimeMotorStarts = LIFETIME_MOTOR_STARTS_EDEFAULT;
        lifetimeMotorStartsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_MOTOR_STARTS, oldLifetimeMotorStarts,
                LIFETIME_MOTOR_STARTS_EDEFAULT, oldLifetimeMotorStartsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLifetimeMotorStarts() {
        return lifetimeMotorStartsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getLifetimeTotalOperations() {
        return lifetimeTotalOperations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLifetimeTotalOperations( Integer newLifetimeTotalOperations ) {
        Integer oldLifetimeTotalOperations = lifetimeTotalOperations;
        lifetimeTotalOperations = newLifetimeTotalOperations;
        boolean oldLifetimeTotalOperationsESet = lifetimeTotalOperationsESet;
        lifetimeTotalOperationsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_TOTAL_OPERATIONS, oldLifetimeTotalOperations,
                lifetimeTotalOperations, !oldLifetimeTotalOperationsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLifetimeTotalOperations() {
        Integer oldLifetimeTotalOperations = lifetimeTotalOperations;
        boolean oldLifetimeTotalOperationsESet = lifetimeTotalOperationsESet;
        lifetimeTotalOperations = LIFETIME_TOTAL_OPERATIONS_EDEFAULT;
        lifetimeTotalOperationsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_TOTAL_OPERATIONS, oldLifetimeTotalOperations,
                LIFETIME_TOTAL_OPERATIONS_EDEFAULT, oldLifetimeTotalOperationsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLifetimeTotalOperations() {
        return lifetimeTotalOperationsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getMostRecentFaultOperationDate() {
        return mostRecentFaultOperationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMostRecentFaultOperationDate( Date newMostRecentFaultOperationDate ) {
        Date oldMostRecentFaultOperationDate = mostRecentFaultOperationDate;
        mostRecentFaultOperationDate = newMostRecentFaultOperationDate;
        boolean oldMostRecentFaultOperationDateESet = mostRecentFaultOperationDateESet;
        mostRecentFaultOperationDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_FAULT_OPERATION_DATE, oldMostRecentFaultOperationDate,
                mostRecentFaultOperationDate, !oldMostRecentFaultOperationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMostRecentFaultOperationDate() {
        Date oldMostRecentFaultOperationDate = mostRecentFaultOperationDate;
        boolean oldMostRecentFaultOperationDateESet = mostRecentFaultOperationDateESet;
        mostRecentFaultOperationDate = MOST_RECENT_FAULT_OPERATION_DATE_EDEFAULT;
        mostRecentFaultOperationDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_FAULT_OPERATION_DATE, oldMostRecentFaultOperationDate,
                MOST_RECENT_FAULT_OPERATION_DATE_EDEFAULT, oldMostRecentFaultOperationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMostRecentFaultOperationDate() {
        return mostRecentFaultOperationDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getMostRecentMotorStartDate() {
        return mostRecentMotorStartDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMostRecentMotorStartDate( Date newMostRecentMotorStartDate ) {
        Date oldMostRecentMotorStartDate = mostRecentMotorStartDate;
        mostRecentMotorStartDate = newMostRecentMotorStartDate;
        boolean oldMostRecentMotorStartDateESet = mostRecentMotorStartDateESet;
        mostRecentMotorStartDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_MOTOR_START_DATE, oldMostRecentMotorStartDate,
                mostRecentMotorStartDate, !oldMostRecentMotorStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMostRecentMotorStartDate() {
        Date oldMostRecentMotorStartDate = mostRecentMotorStartDate;
        boolean oldMostRecentMotorStartDateESet = mostRecentMotorStartDateESet;
        mostRecentMotorStartDate = MOST_RECENT_MOTOR_START_DATE_EDEFAULT;
        mostRecentMotorStartDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_MOTOR_START_DATE, oldMostRecentMotorStartDate,
                MOST_RECENT_MOTOR_START_DATE_EDEFAULT, oldMostRecentMotorStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMostRecentMotorStartDate() {
        return mostRecentMotorStartDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getMostRecentOperationDate() {
        return mostRecentOperationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMostRecentOperationDate( Date newMostRecentOperationDate ) {
        Date oldMostRecentOperationDate = mostRecentOperationDate;
        mostRecentOperationDate = newMostRecentOperationDate;
        boolean oldMostRecentOperationDateESet = mostRecentOperationDateESet;
        mostRecentOperationDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_OPERATION_DATE, oldMostRecentOperationDate,
                mostRecentOperationDate, !oldMostRecentOperationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMostRecentOperationDate() {
        Date oldMostRecentOperationDate = mostRecentOperationDate;
        boolean oldMostRecentOperationDateESet = mostRecentOperationDateESet;
        mostRecentOperationDate = MOST_RECENT_OPERATION_DATE_EDEFAULT;
        mostRecentOperationDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_OPERATION_DATE, oldMostRecentOperationDate,
                MOST_RECENT_OPERATION_DATE_EDEFAULT, oldMostRecentOperationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMostRecentOperationDate() {
        return mostRecentOperationDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getBreaker() {
        if( breaker != null && breaker.eIsProxy() ) {
            InternalEObject oldBreaker = ( InternalEObject ) breaker;
            breaker = ( Asset ) eResolveProxy( oldBreaker );
            if( breaker != oldBreaker ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, oldBreaker, breaker ) );
            }
        }
        return breaker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Asset basicGetBreaker() {
        return breaker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBreaker( Asset newBreaker, NotificationChain msgs ) {
        Asset oldBreaker = breaker;
        breaker = newBreaker;
        boolean oldBreakerESet = breakerESet;
        breakerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, oldBreaker, newBreaker, !oldBreakerESet );
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
    public void setBreaker( Asset newBreaker ) {
        if( newBreaker != breaker ) {
            NotificationChain msgs = null;
            if( breaker != null ) msgs = ( ( InternalEObject ) breaker ).eInverseRemove( this,
                    CimPackage.ASSET__BREAKER_OPERATION, Asset.class, msgs );
            if( newBreaker != null ) msgs = ( ( InternalEObject ) newBreaker ).eInverseAdd( this,
                    CimPackage.ASSET__BREAKER_OPERATION, Asset.class, msgs );
            msgs = basicSetBreaker( newBreaker, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBreakerESet = breakerESet;
            breakerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, newBreaker, newBreaker, !oldBreakerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBreaker( NotificationChain msgs ) {
        Asset oldBreaker = breaker;
        breaker = null;
        boolean oldBreakerESet = breakerESet;
        breakerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, oldBreaker, null, oldBreakerESet );
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
    public void unsetBreaker() {
        if( breaker != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) breaker ).eInverseRemove( this, CimPackage.ASSET__BREAKER_OPERATION,
                    Asset.class, msgs );
            msgs = basicUnsetBreaker( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBreakerESet = breakerESet;
            breakerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER, null, null, oldBreakerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBreaker() {
        return breakerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER:
            if( breaker != null ) msgs = ( ( InternalEObject ) breaker ).eInverseRemove( this,
                    CimPackage.ASSET__BREAKER_OPERATION, Asset.class, msgs );
            return basicSetBreaker( ( Asset ) otherEnd, msgs );
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
        case CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER:
            return basicUnsetBreaker( msgs );
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
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_FAULT_OPERATIONS:
            return getLifetimeFaultOperations();
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_MOTOR_STARTS:
            return getLifetimeMotorStarts();
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_TOTAL_OPERATIONS:
            return getLifetimeTotalOperations();
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_FAULT_OPERATION_DATE:
            return getMostRecentFaultOperationDate();
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_MOTOR_START_DATE:
            return getMostRecentMotorStartDate();
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_OPERATION_DATE:
            return getMostRecentOperationDate();
        case CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER:
            if( resolve ) return getBreaker();
            return basicGetBreaker();
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
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_FAULT_OPERATIONS:
            setLifetimeFaultOperations( ( Integer ) newValue );
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_MOTOR_STARTS:
            setLifetimeMotorStarts( ( Integer ) newValue );
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_TOTAL_OPERATIONS:
            setLifetimeTotalOperations( ( Integer ) newValue );
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_FAULT_OPERATION_DATE:
            setMostRecentFaultOperationDate( ( Date ) newValue );
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_MOTOR_START_DATE:
            setMostRecentMotorStartDate( ( Date ) newValue );
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_OPERATION_DATE:
            setMostRecentOperationDate( ( Date ) newValue );
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER:
            setBreaker( ( Asset ) newValue );
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
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_FAULT_OPERATIONS:
            unsetLifetimeFaultOperations();
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_MOTOR_STARTS:
            unsetLifetimeMotorStarts();
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_TOTAL_OPERATIONS:
            unsetLifetimeTotalOperations();
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_FAULT_OPERATION_DATE:
            unsetMostRecentFaultOperationDate();
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_MOTOR_START_DATE:
            unsetMostRecentMotorStartDate();
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_OPERATION_DATE:
            unsetMostRecentOperationDate();
            return;
        case CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER:
            unsetBreaker();
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
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_FAULT_OPERATIONS:
            return isSetLifetimeFaultOperations();
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_MOTOR_STARTS:
            return isSetLifetimeMotorStarts();
        case CimPackage.SWITCH_OPERATION_SUMMARY__LIFETIME_TOTAL_OPERATIONS:
            return isSetLifetimeTotalOperations();
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_FAULT_OPERATION_DATE:
            return isSetMostRecentFaultOperationDate();
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_MOTOR_START_DATE:
            return isSetMostRecentMotorStartDate();
        case CimPackage.SWITCH_OPERATION_SUMMARY__MOST_RECENT_OPERATION_DATE:
            return isSetMostRecentOperationDate();
        case CimPackage.SWITCH_OPERATION_SUMMARY__BREAKER:
            return isSetBreaker();
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
        result.append( " (lifetimeFaultOperations: " );
        if( lifetimeFaultOperationsESet )
            result.append( lifetimeFaultOperations );
        else
            result.append( "<unset>" );
        result.append( ", lifetimeMotorStarts: " );
        if( lifetimeMotorStartsESet )
            result.append( lifetimeMotorStarts );
        else
            result.append( "<unset>" );
        result.append( ", lifetimeTotalOperations: " );
        if( lifetimeTotalOperationsESet )
            result.append( lifetimeTotalOperations );
        else
            result.append( "<unset>" );
        result.append( ", mostRecentFaultOperationDate: " );
        if( mostRecentFaultOperationDateESet )
            result.append( mostRecentFaultOperationDate );
        else
            result.append( "<unset>" );
        result.append( ", mostRecentMotorStartDate: " );
        if( mostRecentMotorStartDateESet )
            result.append( mostRecentMotorStartDate );
        else
            result.append( "<unset>" );
        result.append( ", mostRecentOperationDate: " );
        if( mostRecentOperationDateESet )
            result.append( mostRecentOperationDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchOperationSummaryImpl
