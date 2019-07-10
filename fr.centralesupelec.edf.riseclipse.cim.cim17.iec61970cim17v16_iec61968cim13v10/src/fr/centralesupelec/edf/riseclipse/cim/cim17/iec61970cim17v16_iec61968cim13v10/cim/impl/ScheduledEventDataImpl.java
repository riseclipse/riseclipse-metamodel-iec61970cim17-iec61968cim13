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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;

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
 * An implementation of the model object '<em><b>Scheduled Event Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventDataImpl#getEstimatedWindow <em>Estimated Window</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventDataImpl#getRequestedWindow <em>Requested Window</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventDataImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventDataImpl#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ScheduledEventDataImpl#getInspectionDataSet <em>Inspection Data Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduledEventDataImpl extends CimObjectWithIDImpl implements ScheduledEventData {
    /**
     * The cached value of the '{@link #getEstimatedWindow() <em>Estimated Window</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEstimatedWindow()
     * @generated
     * @ordered
     */
    protected DateTimeInterval estimatedWindow;

    /**
     * This is true if the Estimated Window containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean estimatedWindowESet;

    /**
     * The cached value of the '{@link #getRequestedWindow() <em>Requested Window</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequestedWindow()
     * @generated
     * @ordered
     */
    protected DateTimeInterval requestedWindow;

    /**
     * This is true if the Requested Window containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean requestedWindowESet;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getScheduledEvents() <em>Scheduled Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScheduledEvents()
     * @generated
     * @ordered
     */
    protected EList< ScheduledEvent > scheduledEvents;

    /**
     * The cached value of the '{@link #getInspectionDataSet() <em>Inspection Data Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInspectionDataSet()
     * @generated
     * @ordered
     */
    protected InspectionDataSet inspectionDataSet;

    /**
     * This is true if the Inspection Data Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inspectionDataSetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScheduledEventDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getScheduledEventData();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getEstimatedWindow() {
        return estimatedWindow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEstimatedWindow( DateTimeInterval newEstimatedWindow, NotificationChain msgs ) {
        DateTimeInterval oldEstimatedWindow = estimatedWindow;
        estimatedWindow = newEstimatedWindow;
        boolean oldEstimatedWindowESet = estimatedWindowESet;
        estimatedWindowESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW, oldEstimatedWindow, newEstimatedWindow,
                    !oldEstimatedWindowESet );
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
    public void setEstimatedWindow( DateTimeInterval newEstimatedWindow ) {
        if( newEstimatedWindow != estimatedWindow ) {
            NotificationChain msgs = null;
            if( estimatedWindow != null ) msgs = ( ( InternalEObject ) estimatedWindow ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW, null, msgs );
            if( newEstimatedWindow != null ) msgs = ( ( InternalEObject ) newEstimatedWindow ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW, null, msgs );
            msgs = basicSetEstimatedWindow( newEstimatedWindow, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEstimatedWindowESet = estimatedWindowESet;
            estimatedWindowESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW,
                            newEstimatedWindow, newEstimatedWindow, !oldEstimatedWindowESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEstimatedWindow( NotificationChain msgs ) {
        DateTimeInterval oldEstimatedWindow = estimatedWindow;
        estimatedWindow = null;
        boolean oldEstimatedWindowESet = estimatedWindowESet;
        estimatedWindowESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW, oldEstimatedWindow, null,
                    oldEstimatedWindowESet );
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
    public void unsetEstimatedWindow() {
        if( estimatedWindow != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) estimatedWindow ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW, null, msgs );
            msgs = basicUnsetEstimatedWindow( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEstimatedWindowESet = estimatedWindowESet;
            estimatedWindowESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW, null, null, oldEstimatedWindowESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEstimatedWindow() {
        return estimatedWindowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getRequestedWindow() {
        return requestedWindow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRequestedWindow( DateTimeInterval newRequestedWindow, NotificationChain msgs ) {
        DateTimeInterval oldRequestedWindow = requestedWindow;
        requestedWindow = newRequestedWindow;
        boolean oldRequestedWindowESet = requestedWindowESet;
        requestedWindowESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW, oldRequestedWindow, newRequestedWindow,
                    !oldRequestedWindowESet );
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
    public void setRequestedWindow( DateTimeInterval newRequestedWindow ) {
        if( newRequestedWindow != requestedWindow ) {
            NotificationChain msgs = null;
            if( requestedWindow != null ) msgs = ( ( InternalEObject ) requestedWindow ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW, null, msgs );
            if( newRequestedWindow != null ) msgs = ( ( InternalEObject ) newRequestedWindow ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW, null, msgs );
            msgs = basicSetRequestedWindow( newRequestedWindow, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRequestedWindowESet = requestedWindowESet;
            requestedWindowESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW,
                            newRequestedWindow, newRequestedWindow, !oldRequestedWindowESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRequestedWindow( NotificationChain msgs ) {
        DateTimeInterval oldRequestedWindow = requestedWindow;
        requestedWindow = null;
        boolean oldRequestedWindowESet = requestedWindowESet;
        requestedWindowESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW, oldRequestedWindow, null,
                    oldRequestedWindowESet );
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
    public void unsetRequestedWindow() {
        if( requestedWindow != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) requestedWindow ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW, null, msgs );
            msgs = basicUnsetRequestedWindow( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRequestedWindowESet = requestedWindowESet;
            requestedWindowESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW, null, null, oldRequestedWindowESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRequestedWindow() {
        return requestedWindowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SCHEDULED_EVENT_DATA__STATUS, oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null ) msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SCHEDULED_EVENT_DATA__STATUS, newStatus, newStatus, !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT_DATA__STATUS, oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.SCHEDULED_EVENT_DATA__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT_DATA__STATUS, null, null, oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ScheduledEvent > getScheduledEvents() {
        if( scheduledEvents == null ) {
            scheduledEvents = new EObjectWithInverseResolvingEList.Unsettable< ScheduledEvent >( ScheduledEvent.class,
                    this, CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS,
                    CimPackage.SCHEDULED_EVENT__SCHEDULED_EVENT_DATA );
        }
        return scheduledEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScheduledEvents() {
        if( scheduledEvents != null ) ( ( InternalEList.Unsettable< ? > ) scheduledEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScheduledEvents() {
        return scheduledEvents != null && ( ( InternalEList.Unsettable< ? > ) scheduledEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InspectionDataSet getInspectionDataSet() {
        return inspectionDataSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInspectionDataSet( InspectionDataSet newInspectionDataSet,
            NotificationChain msgs ) {
        InspectionDataSet oldInspectionDataSet = inspectionDataSet;
        inspectionDataSet = newInspectionDataSet;
        boolean oldInspectionDataSetESet = inspectionDataSetESet;
        inspectionDataSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET, oldInspectionDataSet, newInspectionDataSet,
                    !oldInspectionDataSetESet );
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
    public void setInspectionDataSet( InspectionDataSet newInspectionDataSet ) {
        if( newInspectionDataSet != inspectionDataSet ) {
            NotificationChain msgs = null;
            if( inspectionDataSet != null ) msgs = ( ( InternalEObject ) inspectionDataSet ).eInverseRemove( this,
                    CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs );
            if( newInspectionDataSet != null ) msgs = ( ( InternalEObject ) newInspectionDataSet ).eInverseAdd( this,
                    CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs );
            msgs = basicSetInspectionDataSet( newInspectionDataSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInspectionDataSetESet = inspectionDataSetESet;
            inspectionDataSetESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET,
                            newInspectionDataSet, newInspectionDataSet, !oldInspectionDataSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetInspectionDataSet( NotificationChain msgs ) {
        InspectionDataSet oldInspectionDataSet = inspectionDataSet;
        inspectionDataSet = null;
        boolean oldInspectionDataSetESet = inspectionDataSetESet;
        inspectionDataSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET, oldInspectionDataSet, null,
                    oldInspectionDataSetESet );
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
    public void unsetInspectionDataSet() {
        if( inspectionDataSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) inspectionDataSet ).eInverseRemove( this,
                    CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs );
            msgs = basicUnsetInspectionDataSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldInspectionDataSetESet = inspectionDataSetESet;
            inspectionDataSetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET, null, null, oldInspectionDataSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInspectionDataSet() {
        return inspectionDataSetESet;
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
        case CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getScheduledEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET:
            if( inspectionDataSet != null ) msgs = ( ( InternalEObject ) inspectionDataSet ).eInverseRemove( this,
                    CimPackage.INSPECTION_DATA_SET__ACCORDING_TO_SCHEDULES, InspectionDataSet.class, msgs );
            return basicSetInspectionDataSet( ( InspectionDataSet ) otherEnd, msgs );
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
        case CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW:
            return basicUnsetEstimatedWindow( msgs );
        case CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW:
            return basicUnsetRequestedWindow( msgs );
        case CimPackage.SCHEDULED_EVENT_DATA__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS:
            return ( ( InternalEList< ? > ) getScheduledEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET:
            return basicUnsetInspectionDataSet( msgs );
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
        case CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW:
            return getEstimatedWindow();
        case CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW:
            return getRequestedWindow();
        case CimPackage.SCHEDULED_EVENT_DATA__STATUS:
            return getStatus();
        case CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS:
            return getScheduledEvents();
        case CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET:
            return getInspectionDataSet();
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
        case CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW:
            setEstimatedWindow( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW:
            setRequestedWindow( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.SCHEDULED_EVENT_DATA__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS:
            getScheduledEvents().clear();
            getScheduledEvents().addAll( ( Collection< ? extends ScheduledEvent > ) newValue );
            return;
        case CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET:
            setInspectionDataSet( ( InspectionDataSet ) newValue );
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
        case CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW:
            unsetEstimatedWindow();
            return;
        case CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW:
            unsetRequestedWindow();
            return;
        case CimPackage.SCHEDULED_EVENT_DATA__STATUS:
            unsetStatus();
            return;
        case CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS:
            unsetScheduledEvents();
            return;
        case CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET:
            unsetInspectionDataSet();
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
        case CimPackage.SCHEDULED_EVENT_DATA__ESTIMATED_WINDOW:
            return isSetEstimatedWindow();
        case CimPackage.SCHEDULED_EVENT_DATA__REQUESTED_WINDOW:
            return isSetRequestedWindow();
        case CimPackage.SCHEDULED_EVENT_DATA__STATUS:
            return isSetStatus();
        case CimPackage.SCHEDULED_EVENT_DATA__SCHEDULED_EVENTS:
            return isSetScheduledEvents();
        case CimPackage.SCHEDULED_EVENT_DATA__INSPECTION_DATA_SET:
            return isSetInspectionDataSet();
        }
        return super.eIsSet( featureID );
    }

} //ScheduledEventDataImpl
