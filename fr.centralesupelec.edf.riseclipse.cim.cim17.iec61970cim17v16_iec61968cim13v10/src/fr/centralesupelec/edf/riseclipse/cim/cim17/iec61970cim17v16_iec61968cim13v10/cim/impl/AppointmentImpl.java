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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work;

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
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AppointmentImpl#getCallAhead <em>Call Ahead</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AppointmentImpl#getMeetingInterval <em>Meeting Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AppointmentImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AppointmentImpl#getWorks <em>Works</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppointmentImpl extends IdentifiedObjectImpl implements Appointment {
    /**
     * The default value of the '{@link #getCallAhead() <em>Call Ahead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallAhead()
     * @generated
     * @ordered
     */
    protected static final Boolean CALL_AHEAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCallAhead() <em>Call Ahead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCallAhead()
     * @generated
     * @ordered
     */
    protected Boolean callAhead = CALL_AHEAD_EDEFAULT;

    /**
     * This is true if the Call Ahead attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean callAheadESet;

    /**
     * The cached value of the '{@link #getMeetingInterval() <em>Meeting Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeetingInterval()
     * @generated
     * @ordered
     */
    protected DateTimeInterval meetingInterval;

    /**
     * This is true if the Meeting Interval containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean meetingIntervalESet;

    /**
     * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPersons()
     * @generated
     * @ordered
     */
    protected EList< PersonRole > persons;

    /**
     * The cached value of the '{@link #getWorks() <em>Works</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorks()
     * @generated
     * @ordered
     */
    protected EList< Work > works;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AppointmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAppointment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCallAhead() {
        return callAhead;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCallAhead( Boolean newCallAhead ) {
        Boolean oldCallAhead = callAhead;
        callAhead = newCallAhead;
        boolean oldCallAheadESet = callAheadESet;
        callAheadESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.APPOINTMENT__CALL_AHEAD, oldCallAhead, callAhead, !oldCallAheadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCallAhead() {
        Boolean oldCallAhead = callAhead;
        boolean oldCallAheadESet = callAheadESet;
        callAhead = CALL_AHEAD_EDEFAULT;
        callAheadESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.APPOINTMENT__CALL_AHEAD, oldCallAhead, CALL_AHEAD_EDEFAULT, oldCallAheadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCallAhead() {
        return callAheadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getMeetingInterval() {
        return meetingInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeetingInterval( DateTimeInterval newMeetingInterval, NotificationChain msgs ) {
        DateTimeInterval oldMeetingInterval = meetingInterval;
        meetingInterval = newMeetingInterval;
        boolean oldMeetingIntervalESet = meetingIntervalESet;
        meetingIntervalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.APPOINTMENT__MEETING_INTERVAL, oldMeetingInterval, newMeetingInterval,
                    !oldMeetingIntervalESet );
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
    public void setMeetingInterval( DateTimeInterval newMeetingInterval ) {
        if( newMeetingInterval != meetingInterval ) {
            NotificationChain msgs = null;
            if( meetingInterval != null ) msgs = ( ( InternalEObject ) meetingInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.APPOINTMENT__MEETING_INTERVAL, null, msgs );
            if( newMeetingInterval != null ) msgs = ( ( InternalEObject ) newMeetingInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.APPOINTMENT__MEETING_INTERVAL, null, msgs );
            msgs = basicSetMeetingInterval( newMeetingInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeetingIntervalESet = meetingIntervalESet;
            meetingIntervalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.APPOINTMENT__MEETING_INTERVAL,
                        newMeetingInterval, newMeetingInterval, !oldMeetingIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeetingInterval( NotificationChain msgs ) {
        DateTimeInterval oldMeetingInterval = meetingInterval;
        meetingInterval = null;
        boolean oldMeetingIntervalESet = meetingIntervalESet;
        meetingIntervalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.APPOINTMENT__MEETING_INTERVAL, oldMeetingInterval, null, oldMeetingIntervalESet );
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
    public void unsetMeetingInterval() {
        if( meetingInterval != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) meetingInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.APPOINTMENT__MEETING_INTERVAL, null, msgs );
            msgs = basicUnsetMeetingInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeetingIntervalESet = meetingIntervalESet;
            meetingIntervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.APPOINTMENT__MEETING_INTERVAL, null, null, oldMeetingIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeetingInterval() {
        return meetingIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PersonRole > getPersons() {
        if( persons == null ) {
            persons = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< PersonRole >( PersonRole.class, this,
                    CimPackage.APPOINTMENT__PERSONS, CimPackage.PERSON_ROLE__APPOINTMENTS );
        }
        return persons;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPersons() {
        if( persons != null ) ( ( InternalEList.Unsettable< ? > ) persons ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPersons() {
        return persons != null && ( ( InternalEList.Unsettable< ? > ) persons ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Work > getWorks() {
        if( works == null ) {
            works = new EObjectWithInverseEList.Unsettable.ManyInverse< Work >( Work.class, this,
                    CimPackage.APPOINTMENT__WORKS, CimPackage.WORK__APPOINTMENTS );
        }
        return works;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorks() {
        if( works != null ) ( ( InternalEList.Unsettable< ? > ) works ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorks() {
        return works != null && ( ( InternalEList.Unsettable< ? > ) works ).isSet();
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
        case CimPackage.APPOINTMENT__PERSONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPersons() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.APPOINTMENT__WORKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorks() ).basicAdd( otherEnd,
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
        case CimPackage.APPOINTMENT__MEETING_INTERVAL:
            return basicUnsetMeetingInterval( msgs );
        case CimPackage.APPOINTMENT__PERSONS:
            return ( ( InternalEList< ? > ) getPersons() ).basicRemove( otherEnd, msgs );
        case CimPackage.APPOINTMENT__WORKS:
            return ( ( InternalEList< ? > ) getWorks() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.APPOINTMENT__CALL_AHEAD:
            return getCallAhead();
        case CimPackage.APPOINTMENT__MEETING_INTERVAL:
            return getMeetingInterval();
        case CimPackage.APPOINTMENT__PERSONS:
            return getPersons();
        case CimPackage.APPOINTMENT__WORKS:
            return getWorks();
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
        case CimPackage.APPOINTMENT__CALL_AHEAD:
            setCallAhead( ( Boolean ) newValue );
            return;
        case CimPackage.APPOINTMENT__MEETING_INTERVAL:
            setMeetingInterval( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.APPOINTMENT__PERSONS:
            getPersons().clear();
            getPersons().addAll( ( Collection< ? extends PersonRole > ) newValue );
            return;
        case CimPackage.APPOINTMENT__WORKS:
            getWorks().clear();
            getWorks().addAll( ( Collection< ? extends Work > ) newValue );
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
        case CimPackage.APPOINTMENT__CALL_AHEAD:
            unsetCallAhead();
            return;
        case CimPackage.APPOINTMENT__MEETING_INTERVAL:
            unsetMeetingInterval();
            return;
        case CimPackage.APPOINTMENT__PERSONS:
            unsetPersons();
            return;
        case CimPackage.APPOINTMENT__WORKS:
            unsetWorks();
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
        case CimPackage.APPOINTMENT__CALL_AHEAD:
            return isSetCallAhead();
        case CimPackage.APPOINTMENT__MEETING_INTERVAL:
            return isSetMeetingInterval();
        case CimPackage.APPOINTMENT__PERSONS:
            return isSetPersons();
        case CimPackage.APPOINTMENT__WORKS:
            return isSetWorks();
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
        result.append( " (callAhead: " );
        if( callAheadESet )
            result.append( callAhead );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AppointmentImpl
