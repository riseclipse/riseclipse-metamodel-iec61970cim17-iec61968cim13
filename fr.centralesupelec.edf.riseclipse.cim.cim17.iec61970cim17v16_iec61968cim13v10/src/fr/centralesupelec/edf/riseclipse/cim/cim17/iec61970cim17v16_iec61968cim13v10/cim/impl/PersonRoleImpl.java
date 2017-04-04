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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole;

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
 * An implementation of the model object '<em><b>Person Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonRoleImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonRoleImpl#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PersonRoleImpl#getConfigurationEvents <em>Configuration Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonRoleImpl extends IdentifiedObjectImpl implements PersonRole {
    /**
     * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerson()
     * @generated
     * @ordered
     */
    protected Person person;

    /**
     * This is true if the Person reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean personESet;

    /**
     * The cached value of the '{@link #getAppointments() <em>Appointments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppointments()
     * @generated
     * @ordered
     */
    protected EList< Appointment > appointments;

    /**
     * The cached value of the '{@link #getConfigurationEvents() <em>Configuration Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationEvents()
     * @generated
     * @ordered
     */
    protected EList< ConfigurationEvent > configurationEvents;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPersonRole();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Person getPerson() {
        return person;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPerson( Person newPerson, NotificationChain msgs ) {
        Person oldPerson = person;
        person = newPerson;
        boolean oldPersonESet = personESet;
        personESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PERSON_ROLE__PERSON, oldPerson, newPerson, !oldPersonESet );
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
    public void setPerson( Person newPerson ) {
        if( newPerson != person ) {
            NotificationChain msgs = null;
            if( person != null ) msgs = ( ( InternalEObject ) person ).eInverseRemove( this, CimPackage.PERSON__ROLES,
                    Person.class, msgs );
            if( newPerson != null ) msgs = ( ( InternalEObject ) newPerson ).eInverseAdd( this,
                    CimPackage.PERSON__ROLES, Person.class, msgs );
            msgs = basicSetPerson( newPerson, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPersonESet = personESet;
            personESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PERSON_ROLE__PERSON, newPerson, newPerson, !oldPersonESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPerson( NotificationChain msgs ) {
        Person oldPerson = person;
        person = null;
        boolean oldPersonESet = personESet;
        personESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PERSON_ROLE__PERSON, oldPerson, null, oldPersonESet );
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
    public void unsetPerson() {
        if( person != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) person ).eInverseRemove( this, CimPackage.PERSON__ROLES, Person.class, msgs );
            msgs = basicUnsetPerson( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPersonESet = personESet;
            personESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PERSON_ROLE__PERSON, null, null, oldPersonESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPerson() {
        return personESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Appointment > getAppointments() {
        if( appointments == null ) {
            appointments = new EObjectWithInverseEList.Unsettable.ManyInverse< Appointment >( Appointment.class, this,
                    CimPackage.PERSON_ROLE__APPOINTMENTS, CimPackage.APPOINTMENT__PERSONS );
        }
        return appointments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAppointments() {
        if( appointments != null ) ( ( InternalEList.Unsettable< ? > ) appointments ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAppointments() {
        return appointments != null && ( ( InternalEList.Unsettable< ? > ) appointments ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConfigurationEvent > getConfigurationEvents() {
        if( configurationEvents == null ) {
            configurationEvents = new EObjectWithInverseResolvingEList.Unsettable< ConfigurationEvent >(
                    ConfigurationEvent.class, this, CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_PERSON_ROLE );
        }
        return configurationEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigurationEvents() {
        if( configurationEvents != null ) ( ( InternalEList.Unsettable< ? > ) configurationEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigurationEvents() {
        return configurationEvents != null && ( ( InternalEList.Unsettable< ? > ) configurationEvents ).isSet();
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
        case CimPackage.PERSON_ROLE__PERSON:
            if( person != null ) msgs = ( ( InternalEObject ) person ).eInverseRemove( this, CimPackage.PERSON__ROLES,
                    Person.class, msgs );
            return basicSetPerson( ( Person ) otherEnd, msgs );
        case CimPackage.PERSON_ROLE__APPOINTMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAppointments() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConfigurationEvents() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.PERSON_ROLE__PERSON:
            return basicUnsetPerson( msgs );
        case CimPackage.PERSON_ROLE__APPOINTMENTS:
            return ( ( InternalEList< ? > ) getAppointments() ).basicRemove( otherEnd, msgs );
        case CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS:
            return ( ( InternalEList< ? > ) getConfigurationEvents() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PERSON_ROLE__PERSON:
            return getPerson();
        case CimPackage.PERSON_ROLE__APPOINTMENTS:
            return getAppointments();
        case CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS:
            return getConfigurationEvents();
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
        case CimPackage.PERSON_ROLE__PERSON:
            setPerson( ( Person ) newValue );
            return;
        case CimPackage.PERSON_ROLE__APPOINTMENTS:
            getAppointments().clear();
            getAppointments().addAll( ( Collection< ? extends Appointment > ) newValue );
            return;
        case CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS:
            getConfigurationEvents().clear();
            getConfigurationEvents().addAll( ( Collection< ? extends ConfigurationEvent > ) newValue );
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
        case CimPackage.PERSON_ROLE__PERSON:
            unsetPerson();
            return;
        case CimPackage.PERSON_ROLE__APPOINTMENTS:
            unsetAppointments();
            return;
        case CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS:
            unsetConfigurationEvents();
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
        case CimPackage.PERSON_ROLE__PERSON:
            return isSetPerson();
        case CimPackage.PERSON_ROLE__APPOINTMENTS:
            return isSetAppointments();
        case CimPackage.PERSON_ROLE__CONFIGURATION_EVENTS:
            return isSetConfigurationEvents();
        }
        return super.eIsSet( featureID );
    }

} //PersonRoleImpl
