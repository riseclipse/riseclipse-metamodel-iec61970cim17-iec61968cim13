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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerAgreement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EndDeviceEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Meter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeterReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UsagePoint;

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
 * An implementation of the model object '<em><b>Meter Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeterReadingImpl#getIsCoincidentTrigger <em>Is Coincident Trigger</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeterReadingImpl#getValuesInterval <em>Values Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeterReadingImpl#getCustomerAgreement <em>Customer Agreement</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeterReadingImpl#getIntervalBlocks <em>Interval Blocks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeterReadingImpl#getUsagePoint <em>Usage Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeterReadingImpl#getEndDeviceEvents <em>End Device Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeterReadingImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeterReadingImpl#getMeter <em>Meter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeterReadingImpl extends IdentifiedObjectImpl implements MeterReading {
    /**
     * The default value of the '{@link #getIsCoincidentTrigger() <em>Is Coincident Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsCoincidentTrigger()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_COINCIDENT_TRIGGER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsCoincidentTrigger() <em>Is Coincident Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsCoincidentTrigger()
     * @generated
     * @ordered
     */
    protected Boolean isCoincidentTrigger = IS_COINCIDENT_TRIGGER_EDEFAULT;

    /**
     * This is true if the Is Coincident Trigger attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isCoincidentTriggerESet;

    /**
     * The cached value of the '{@link #getValuesInterval() <em>Values Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValuesInterval()
     * @generated
     * @ordered
     */
    protected DateTimeInterval valuesInterval;

    /**
     * This is true if the Values Interval containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valuesIntervalESet;

    /**
     * The cached value of the '{@link #getCustomerAgreement() <em>Customer Agreement</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerAgreement()
     * @generated
     * @ordered
     */
    protected CustomerAgreement customerAgreement;

    /**
     * This is true if the Customer Agreement reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean customerAgreementESet;

    /**
     * The cached value of the '{@link #getIntervalBlocks() <em>Interval Blocks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntervalBlocks()
     * @generated
     * @ordered
     */
    protected EList< IntervalBlock > intervalBlocks;

    /**
     * The cached value of the '{@link #getUsagePoint() <em>Usage Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsagePoint()
     * @generated
     * @ordered
     */
    protected UsagePoint usagePoint;

    /**
     * This is true if the Usage Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean usagePointESet;

    /**
     * The cached value of the '{@link #getEndDeviceEvents() <em>End Device Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDeviceEvents()
     * @generated
     * @ordered
     */
    protected EList< EndDeviceEvent > endDeviceEvents;

    /**
     * The cached value of the '{@link #getReadings() <em>Readings</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadings()
     * @generated
     * @ordered
     */
    protected EList< Reading > readings;

    /**
     * The cached value of the '{@link #getMeter() <em>Meter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeter()
     * @generated
     * @ordered
     */
    protected Meter meter;

    /**
     * This is true if the Meter reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean meterESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeterReadingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMeterReading();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsCoincidentTrigger() {
        return isCoincidentTrigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsCoincidentTrigger( Boolean newIsCoincidentTrigger ) {
        Boolean oldIsCoincidentTrigger = isCoincidentTrigger;
        isCoincidentTrigger = newIsCoincidentTrigger;
        boolean oldIsCoincidentTriggerESet = isCoincidentTriggerESet;
        isCoincidentTriggerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.METER_READING__IS_COINCIDENT_TRIGGER,
                    oldIsCoincidentTrigger, isCoincidentTrigger, !oldIsCoincidentTriggerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsCoincidentTrigger() {
        Boolean oldIsCoincidentTrigger = isCoincidentTrigger;
        boolean oldIsCoincidentTriggerESet = isCoincidentTriggerESet;
        isCoincidentTrigger = IS_COINCIDENT_TRIGGER_EDEFAULT;
        isCoincidentTriggerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.METER_READING__IS_COINCIDENT_TRIGGER,
                    oldIsCoincidentTrigger, IS_COINCIDENT_TRIGGER_EDEFAULT, oldIsCoincidentTriggerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsCoincidentTrigger() {
        return isCoincidentTriggerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getValuesInterval() {
        return valuesInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValuesInterval( DateTimeInterval newValuesInterval, NotificationChain msgs ) {
        DateTimeInterval oldValuesInterval = valuesInterval;
        valuesInterval = newValuesInterval;
        boolean oldValuesIntervalESet = valuesIntervalESet;
        valuesIntervalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_READING__VALUES_INTERVAL, oldValuesInterval, newValuesInterval,
                    !oldValuesIntervalESet );
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
    public void setValuesInterval( DateTimeInterval newValuesInterval ) {
        if( newValuesInterval != valuesInterval ) {
            NotificationChain msgs = null;
            if( valuesInterval != null ) msgs = ( ( InternalEObject ) valuesInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.METER_READING__VALUES_INTERVAL, null, msgs );
            if( newValuesInterval != null ) msgs = ( ( InternalEObject ) newValuesInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.METER_READING__VALUES_INTERVAL, null, msgs );
            msgs = basicSetValuesInterval( newValuesInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValuesIntervalESet = valuesIntervalESet;
            valuesIntervalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.METER_READING__VALUES_INTERVAL,
                        newValuesInterval, newValuesInterval, !oldValuesIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetValuesInterval( NotificationChain msgs ) {
        DateTimeInterval oldValuesInterval = valuesInterval;
        valuesInterval = null;
        boolean oldValuesIntervalESet = valuesIntervalESet;
        valuesIntervalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_READING__VALUES_INTERVAL, oldValuesInterval, null, oldValuesIntervalESet );
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
    public void unsetValuesInterval() {
        if( valuesInterval != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) valuesInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.METER_READING__VALUES_INTERVAL, null, msgs );
            msgs = basicUnsetValuesInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValuesIntervalESet = valuesIntervalESet;
            valuesIntervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_READING__VALUES_INTERVAL, null, null, oldValuesIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValuesInterval() {
        return valuesIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CustomerAgreement getCustomerAgreement() {
        return customerAgreement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCustomerAgreement( CustomerAgreement newCustomerAgreement,
            NotificationChain msgs ) {
        CustomerAgreement oldCustomerAgreement = customerAgreement;
        customerAgreement = newCustomerAgreement;
        boolean oldCustomerAgreementESet = customerAgreementESet;
        customerAgreementESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_READING__CUSTOMER_AGREEMENT, oldCustomerAgreement, newCustomerAgreement,
                    !oldCustomerAgreementESet );
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
    public void setCustomerAgreement( CustomerAgreement newCustomerAgreement ) {
        if( newCustomerAgreement != customerAgreement ) {
            NotificationChain msgs = null;
            if( customerAgreement != null ) msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs );
            if( newCustomerAgreement != null ) msgs = ( ( InternalEObject ) newCustomerAgreement ).eInverseAdd( this,
                    CimPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs );
            msgs = basicSetCustomerAgreement( newCustomerAgreement, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAgreementESet = customerAgreementESet;
            customerAgreementESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.METER_READING__CUSTOMER_AGREEMENT,
                        newCustomerAgreement, newCustomerAgreement, !oldCustomerAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCustomerAgreement( NotificationChain msgs ) {
        CustomerAgreement oldCustomerAgreement = customerAgreement;
        customerAgreement = null;
        boolean oldCustomerAgreementESet = customerAgreementESet;
        customerAgreementESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_READING__CUSTOMER_AGREEMENT, oldCustomerAgreement, null,
                    oldCustomerAgreementESet );
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
    public void unsetCustomerAgreement() {
        if( customerAgreement != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs );
            msgs = basicUnsetCustomerAgreement( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCustomerAgreementESet = customerAgreementESet;
            customerAgreementESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_READING__CUSTOMER_AGREEMENT, null, null, oldCustomerAgreementESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerAgreement() {
        return customerAgreementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< IntervalBlock > getIntervalBlocks() {
        if( intervalBlocks == null ) {
            intervalBlocks = new EObjectWithInverseResolvingEList.Unsettable< IntervalBlock >( IntervalBlock.class,
                    this, CimPackage.METER_READING__INTERVAL_BLOCKS, CimPackage.INTERVAL_BLOCK__METER_READING );
        }
        return intervalBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntervalBlocks() {
        if( intervalBlocks != null ) ( ( InternalEList.Unsettable< ? > ) intervalBlocks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntervalBlocks() {
        return intervalBlocks != null && ( ( InternalEList.Unsettable< ? > ) intervalBlocks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UsagePoint getUsagePoint() {
        return usagePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUsagePoint( UsagePoint newUsagePoint, NotificationChain msgs ) {
        UsagePoint oldUsagePoint = usagePoint;
        usagePoint = newUsagePoint;
        boolean oldUsagePointESet = usagePointESet;
        usagePointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_READING__USAGE_POINT, oldUsagePoint, newUsagePoint, !oldUsagePointESet );
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
    public void setUsagePoint( UsagePoint newUsagePoint ) {
        if( newUsagePoint != usagePoint ) {
            NotificationChain msgs = null;
            if( usagePoint != null ) msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__METER_READINGS, UsagePoint.class, msgs );
            if( newUsagePoint != null ) msgs = ( ( InternalEObject ) newUsagePoint ).eInverseAdd( this,
                    CimPackage.USAGE_POINT__METER_READINGS, UsagePoint.class, msgs );
            msgs = basicSetUsagePoint( newUsagePoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointESet = usagePointESet;
            usagePointESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_READING__USAGE_POINT, newUsagePoint, newUsagePoint, !oldUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetUsagePoint( NotificationChain msgs ) {
        UsagePoint oldUsagePoint = usagePoint;
        usagePoint = null;
        boolean oldUsagePointESet = usagePointESet;
        usagePointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_READING__USAGE_POINT, oldUsagePoint, null, oldUsagePointESet );
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
    public void unsetUsagePoint() {
        if( usagePoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this, CimPackage.USAGE_POINT__METER_READINGS,
                    UsagePoint.class, msgs );
            msgs = basicUnsetUsagePoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUsagePointESet = usagePointESet;
            usagePointESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_READING__USAGE_POINT, null, null, oldUsagePointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUsagePoint() {
        return usagePointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EndDeviceEvent > getEndDeviceEvents() {
        if( endDeviceEvents == null ) {
            endDeviceEvents = new EObjectWithInverseResolvingEList.Unsettable< EndDeviceEvent >( EndDeviceEvent.class,
                    this, CimPackage.METER_READING__END_DEVICE_EVENTS, CimPackage.END_DEVICE_EVENT__METER_READING );
        }
        return endDeviceEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDeviceEvents() {
        if( endDeviceEvents != null ) ( ( InternalEList.Unsettable< ? > ) endDeviceEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDeviceEvents() {
        return endDeviceEvents != null && ( ( InternalEList.Unsettable< ? > ) endDeviceEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Reading > getReadings() {
        if( readings == null ) {
            readings = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Reading >( Reading.class, this,
                    CimPackage.METER_READING__READINGS, CimPackage.READING__METER_READINGS );
        }
        return readings;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadings() {
        if( readings != null ) ( ( InternalEList.Unsettable< ? > ) readings ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadings() {
        return readings != null && ( ( InternalEList.Unsettable< ? > ) readings ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Meter getMeter() {
        return meter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeter( Meter newMeter, NotificationChain msgs ) {
        Meter oldMeter = meter;
        meter = newMeter;
        boolean oldMeterESet = meterESet;
        meterESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_READING__METER, oldMeter, newMeter, !oldMeterESet );
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
    public void setMeter( Meter newMeter ) {
        if( newMeter != meter ) {
            NotificationChain msgs = null;
            if( meter != null ) msgs = ( ( InternalEObject ) meter ).eInverseRemove( this,
                    CimPackage.METER__METER_READINGS, Meter.class, msgs );
            if( newMeter != null ) msgs = ( ( InternalEObject ) newMeter ).eInverseAdd( this,
                    CimPackage.METER__METER_READINGS, Meter.class, msgs );
            msgs = basicSetMeter( newMeter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterESet = meterESet;
            meterESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.METER_READING__METER, newMeter, newMeter, !oldMeterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeter( NotificationChain msgs ) {
        Meter oldMeter = meter;
        meter = null;
        boolean oldMeterESet = meterESet;
        meterESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_READING__METER, oldMeter, null, oldMeterESet );
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
    public void unsetMeter() {
        if( meter != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) meter ).eInverseRemove( this, CimPackage.METER__METER_READINGS, Meter.class,
                    msgs );
            msgs = basicUnsetMeter( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeterESet = meterESet;
            meterESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.METER_READING__METER, null, null, oldMeterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeter() {
        return meterESet;
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
        case CimPackage.METER_READING__CUSTOMER_AGREEMENT:
            if( customerAgreement != null ) msgs = ( ( InternalEObject ) customerAgreement ).eInverseRemove( this,
                    CimPackage.CUSTOMER_AGREEMENT__METER_READINGS, CustomerAgreement.class, msgs );
            return basicSetCustomerAgreement( ( CustomerAgreement ) otherEnd, msgs );
        case CimPackage.METER_READING__INTERVAL_BLOCKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIntervalBlocks() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.METER_READING__USAGE_POINT:
            if( usagePoint != null ) msgs = ( ( InternalEObject ) usagePoint ).eInverseRemove( this,
                    CimPackage.USAGE_POINT__METER_READINGS, UsagePoint.class, msgs );
            return basicSetUsagePoint( ( UsagePoint ) otherEnd, msgs );
        case CimPackage.METER_READING__END_DEVICE_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEndDeviceEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.METER_READING__READINGS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReadings() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.METER_READING__METER:
            if( meter != null ) msgs = ( ( InternalEObject ) meter ).eInverseRemove( this,
                    CimPackage.METER__METER_READINGS, Meter.class, msgs );
            return basicSetMeter( ( Meter ) otherEnd, msgs );
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
        case CimPackage.METER_READING__VALUES_INTERVAL:
            return basicUnsetValuesInterval( msgs );
        case CimPackage.METER_READING__CUSTOMER_AGREEMENT:
            return basicUnsetCustomerAgreement( msgs );
        case CimPackage.METER_READING__INTERVAL_BLOCKS:
            return ( ( InternalEList< ? > ) getIntervalBlocks() ).basicRemove( otherEnd, msgs );
        case CimPackage.METER_READING__USAGE_POINT:
            return basicUnsetUsagePoint( msgs );
        case CimPackage.METER_READING__END_DEVICE_EVENTS:
            return ( ( InternalEList< ? > ) getEndDeviceEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.METER_READING__READINGS:
            return ( ( InternalEList< ? > ) getReadings() ).basicRemove( otherEnd, msgs );
        case CimPackage.METER_READING__METER:
            return basicUnsetMeter( msgs );
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
        case CimPackage.METER_READING__IS_COINCIDENT_TRIGGER:
            return getIsCoincidentTrigger();
        case CimPackage.METER_READING__VALUES_INTERVAL:
            return getValuesInterval();
        case CimPackage.METER_READING__CUSTOMER_AGREEMENT:
            return getCustomerAgreement();
        case CimPackage.METER_READING__INTERVAL_BLOCKS:
            return getIntervalBlocks();
        case CimPackage.METER_READING__USAGE_POINT:
            return getUsagePoint();
        case CimPackage.METER_READING__END_DEVICE_EVENTS:
            return getEndDeviceEvents();
        case CimPackage.METER_READING__READINGS:
            return getReadings();
        case CimPackage.METER_READING__METER:
            return getMeter();
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
        case CimPackage.METER_READING__IS_COINCIDENT_TRIGGER:
            setIsCoincidentTrigger( ( Boolean ) newValue );
            return;
        case CimPackage.METER_READING__VALUES_INTERVAL:
            setValuesInterval( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.METER_READING__CUSTOMER_AGREEMENT:
            setCustomerAgreement( ( CustomerAgreement ) newValue );
            return;
        case CimPackage.METER_READING__INTERVAL_BLOCKS:
            getIntervalBlocks().clear();
            getIntervalBlocks().addAll( ( Collection< ? extends IntervalBlock > ) newValue );
            return;
        case CimPackage.METER_READING__USAGE_POINT:
            setUsagePoint( ( UsagePoint ) newValue );
            return;
        case CimPackage.METER_READING__END_DEVICE_EVENTS:
            getEndDeviceEvents().clear();
            getEndDeviceEvents().addAll( ( Collection< ? extends EndDeviceEvent > ) newValue );
            return;
        case CimPackage.METER_READING__READINGS:
            getReadings().clear();
            getReadings().addAll( ( Collection< ? extends Reading > ) newValue );
            return;
        case CimPackage.METER_READING__METER:
            setMeter( ( Meter ) newValue );
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
        case CimPackage.METER_READING__IS_COINCIDENT_TRIGGER:
            unsetIsCoincidentTrigger();
            return;
        case CimPackage.METER_READING__VALUES_INTERVAL:
            unsetValuesInterval();
            return;
        case CimPackage.METER_READING__CUSTOMER_AGREEMENT:
            unsetCustomerAgreement();
            return;
        case CimPackage.METER_READING__INTERVAL_BLOCKS:
            unsetIntervalBlocks();
            return;
        case CimPackage.METER_READING__USAGE_POINT:
            unsetUsagePoint();
            return;
        case CimPackage.METER_READING__END_DEVICE_EVENTS:
            unsetEndDeviceEvents();
            return;
        case CimPackage.METER_READING__READINGS:
            unsetReadings();
            return;
        case CimPackage.METER_READING__METER:
            unsetMeter();
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
        case CimPackage.METER_READING__IS_COINCIDENT_TRIGGER:
            return isSetIsCoincidentTrigger();
        case CimPackage.METER_READING__VALUES_INTERVAL:
            return isSetValuesInterval();
        case CimPackage.METER_READING__CUSTOMER_AGREEMENT:
            return isSetCustomerAgreement();
        case CimPackage.METER_READING__INTERVAL_BLOCKS:
            return isSetIntervalBlocks();
        case CimPackage.METER_READING__USAGE_POINT:
            return isSetUsagePoint();
        case CimPackage.METER_READING__END_DEVICE_EVENTS:
            return isSetEndDeviceEvents();
        case CimPackage.METER_READING__READINGS:
            return isSetReadings();
        case CimPackage.METER_READING__METER:
            return isSetMeter();
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
        result.append( " (isCoincidentTrigger: " );
        if( isCoincidentTriggerESet )
            result.append( isCoincidentTrigger );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MeterReadingImpl
