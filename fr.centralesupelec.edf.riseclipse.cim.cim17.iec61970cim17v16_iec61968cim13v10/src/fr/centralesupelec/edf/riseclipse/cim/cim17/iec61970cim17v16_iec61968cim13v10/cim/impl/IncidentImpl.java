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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Operator;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket;
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
 * An implementation of the model object '<em><b>Incident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentImpl#getWorks <em>Works</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentImpl#getOutage <em>Outage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentImpl#getCustomerNotifications <em>Customer Notifications</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentImpl#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentImpl#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncidentImpl extends DocumentImpl implements Incident {
    /**
     * The default value of the '{@link #getCause() <em>Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCause()
     * @generated
     * @ordered
     */
    protected static final String CAUSE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCause() <em>Cause</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCause()
     * @generated
     * @ordered
     */
    protected String cause = CAUSE_EDEFAULT;

    /**
     * This is true if the Cause attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean causeESet;

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
     * The cached value of the '{@link #getOutage() <em>Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutage()
     * @generated
     * @ordered
     */
    protected Outage outage;

    /**
     * This is true if the Outage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outageESet;

    /**
     * The cached value of the '{@link #getCustomerNotifications() <em>Customer Notifications</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCustomerNotifications()
     * @generated
     * @ordered
     */
    protected EList< CustomerNotification > customerNotifications;

    /**
     * The cached value of the '{@link #getTroubleTickets() <em>Trouble Tickets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTroubleTickets()
     * @generated
     * @ordered
     */
    protected EList< TroubleTicket > troubleTickets;

    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected Location location;

    /**
     * This is true if the Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean locationESet;

    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected Operator owner;

    /**
     * This is true if the Owner reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ownerESet;

    /**
     * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHazards()
     * @generated
     * @ordered
     */
    protected EList< IncidentHazard > hazards;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IncidentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIncident();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCause() {
        return cause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCause( String newCause ) {
        String oldCause = cause;
        cause = newCause;
        boolean oldCauseESet = causeESet;
        causeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.INCIDENT__CAUSE, oldCause, cause, !oldCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCause() {
        String oldCause = cause;
        boolean oldCauseESet = causeESet;
        cause = CAUSE_EDEFAULT;
        causeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.INCIDENT__CAUSE, oldCause, CAUSE_EDEFAULT, oldCauseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCause() {
        return causeESet;
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
                    CimPackage.INCIDENT__WORKS, CimPackage.WORK__INCIDENTS );
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
    @Override
    public Outage getOutage() {
        return outage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutage( Outage newOutage, NotificationChain msgs ) {
        Outage oldOutage = outage;
        outage = newOutage;
        boolean oldOutageESet = outageESet;
        outageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.INCIDENT__OUTAGE,
                    oldOutage, newOutage, !oldOutageESet );
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
    public void setOutage( Outage newOutage ) {
        if( newOutage != outage ) {
            NotificationChain msgs = null;
            if( outage != null ) msgs = ( ( InternalEObject ) outage ).eInverseRemove( this,
                    CimPackage.OUTAGE__INCIDENT, Outage.class, msgs );
            if( newOutage != null ) msgs = ( ( InternalEObject ) newOutage ).eInverseAdd( this,
                    CimPackage.OUTAGE__INCIDENT, Outage.class, msgs );
            msgs = basicSetOutage( newOutage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageESet = outageESet;
            outageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCIDENT__OUTAGE, newOutage, newOutage, !oldOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOutage( NotificationChain msgs ) {
        Outage oldOutage = outage;
        outage = null;
        boolean oldOutageESet = outageESet;
        outageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT__OUTAGE, oldOutage, null, oldOutageESet );
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
    public void unsetOutage() {
        if( outage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) outage ).eInverseRemove( this, CimPackage.OUTAGE__INCIDENT, Outage.class,
                    msgs );
            msgs = basicUnsetOutage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOutageESet = outageESet;
            outageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT__OUTAGE, null, null, oldOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutage() {
        return outageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CustomerNotification > getCustomerNotifications() {
        if( customerNotifications == null ) {
            customerNotifications = new EObjectWithInverseResolvingEList.Unsettable< CustomerNotification >(
                    CustomerNotification.class, this, CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS,
                    CimPackage.CUSTOMER_NOTIFICATION__INCIDENT );
        }
        return customerNotifications;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCustomerNotifications() {
        if( customerNotifications != null ) ( ( InternalEList.Unsettable< ? > ) customerNotifications ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCustomerNotifications() {
        return customerNotifications != null && ( ( InternalEList.Unsettable< ? > ) customerNotifications ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TroubleTicket > getTroubleTickets() {
        if( troubleTickets == null ) {
            troubleTickets = new EObjectWithInverseResolvingEList.Unsettable< TroubleTicket >( TroubleTicket.class,
                    this, CimPackage.INCIDENT__TROUBLE_TICKETS, CimPackage.TROUBLE_TICKET__INCIDENT );
        }
        return troubleTickets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTroubleTickets() {
        if( troubleTickets != null ) ( ( InternalEList.Unsettable< ? > ) troubleTickets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTroubleTickets() {
        return troubleTickets != null && ( ( InternalEList.Unsettable< ? > ) troubleTickets ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location getLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation( Location newLocation, NotificationChain msgs ) {
        Location oldLocation = location;
        location = newLocation;
        boolean oldLocationESet = locationESet;
        locationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCIDENT__LOCATION, oldLocation, newLocation, !oldLocationESet );
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
    public void setLocation( Location newLocation ) {
        if( newLocation != location ) {
            NotificationChain msgs = null;
            if( location != null ) msgs = ( ( InternalEObject ) location ).eInverseRemove( this,
                    CimPackage.LOCATION__INCIDENT, Location.class, msgs );
            if( newLocation != null ) msgs = ( ( InternalEObject ) newLocation ).eInverseAdd( this,
                    CimPackage.LOCATION__INCIDENT, Location.class, msgs );
            msgs = basicSetLocation( newLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCIDENT__LOCATION, newLocation, newLocation, !oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLocation( NotificationChain msgs ) {
        Location oldLocation = location;
        location = null;
        boolean oldLocationESet = locationESet;
        locationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT__LOCATION, oldLocation, null, oldLocationESet );
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
    public void unsetLocation() {
        if( location != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__INCIDENT, Location.class,
                    msgs );
            msgs = basicUnsetLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT__LOCATION, null, null, oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocation() {
        return locationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Operator getOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOwner( Operator newOwner, NotificationChain msgs ) {
        Operator oldOwner = owner;
        owner = newOwner;
        boolean oldOwnerESet = ownerESet;
        ownerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.INCIDENT__OWNER,
                    oldOwner, newOwner, !oldOwnerESet );
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
    public void setOwner( Operator newOwner ) {
        if( newOwner != owner ) {
            NotificationChain msgs = null;
            if( owner != null ) msgs = ( ( InternalEObject ) owner ).eInverseRemove( this,
                    CimPackage.OPERATOR__INCIDENTS, Operator.class, msgs );
            if( newOwner != null ) msgs = ( ( InternalEObject ) newOwner ).eInverseAdd( this,
                    CimPackage.OPERATOR__INCIDENTS, Operator.class, msgs );
            msgs = basicSetOwner( newOwner, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOwnerESet = ownerESet;
            ownerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCIDENT__OWNER, newOwner, newOwner, !oldOwnerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOwner( NotificationChain msgs ) {
        Operator oldOwner = owner;
        owner = null;
        boolean oldOwnerESet = ownerESet;
        ownerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT__OWNER, oldOwner, null, oldOwnerESet );
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
    public void unsetOwner() {
        if( owner != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) owner ).eInverseRemove( this, CimPackage.OPERATOR__INCIDENTS, Operator.class,
                    msgs );
            msgs = basicUnsetOwner( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOwnerESet = ownerESet;
            ownerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT__OWNER, null, null, oldOwnerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOwner() {
        return ownerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< IncidentHazard > getHazards() {
        if( hazards == null ) {
            hazards = new EObjectWithInverseResolvingEList.Unsettable< IncidentHazard >( IncidentHazard.class, this,
                    CimPackage.INCIDENT__HAZARDS, CimPackage.INCIDENT_HAZARD__INCIDENT );
        }
        return hazards;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHazards() {
        if( hazards != null ) ( ( InternalEList.Unsettable< ? > ) hazards ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHazards() {
        return hazards != null && ( ( InternalEList.Unsettable< ? > ) hazards ).isSet();
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
        case CimPackage.INCIDENT__WORKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorks() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.INCIDENT__OUTAGE:
            if( outage != null ) msgs = ( ( InternalEObject ) outage ).eInverseRemove( this,
                    CimPackage.OUTAGE__INCIDENT, Outage.class, msgs );
            return basicSetOutage( ( Outage ) otherEnd, msgs );
        case CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCustomerNotifications() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.INCIDENT__TROUBLE_TICKETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTroubleTickets() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.INCIDENT__LOCATION:
            if( location != null ) msgs = ( ( InternalEObject ) location ).eInverseRemove( this,
                    CimPackage.LOCATION__INCIDENT, Location.class, msgs );
            return basicSetLocation( ( Location ) otherEnd, msgs );
        case CimPackage.INCIDENT__OWNER:
            if( owner != null ) msgs = ( ( InternalEObject ) owner ).eInverseRemove( this,
                    CimPackage.OPERATOR__INCIDENTS, Operator.class, msgs );
            return basicSetOwner( ( Operator ) otherEnd, msgs );
        case CimPackage.INCIDENT__HAZARDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHazards() ).basicAdd( otherEnd,
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
        case CimPackage.INCIDENT__WORKS:
            return ( ( InternalEList< ? > ) getWorks() ).basicRemove( otherEnd, msgs );
        case CimPackage.INCIDENT__OUTAGE:
            return basicUnsetOutage( msgs );
        case CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS:
            return ( ( InternalEList< ? > ) getCustomerNotifications() ).basicRemove( otherEnd, msgs );
        case CimPackage.INCIDENT__TROUBLE_TICKETS:
            return ( ( InternalEList< ? > ) getTroubleTickets() ).basicRemove( otherEnd, msgs );
        case CimPackage.INCIDENT__LOCATION:
            return basicUnsetLocation( msgs );
        case CimPackage.INCIDENT__OWNER:
            return basicUnsetOwner( msgs );
        case CimPackage.INCIDENT__HAZARDS:
            return ( ( InternalEList< ? > ) getHazards() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.INCIDENT__CAUSE:
            return getCause();
        case CimPackage.INCIDENT__WORKS:
            return getWorks();
        case CimPackage.INCIDENT__OUTAGE:
            return getOutage();
        case CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS:
            return getCustomerNotifications();
        case CimPackage.INCIDENT__TROUBLE_TICKETS:
            return getTroubleTickets();
        case CimPackage.INCIDENT__LOCATION:
            return getLocation();
        case CimPackage.INCIDENT__OWNER:
            return getOwner();
        case CimPackage.INCIDENT__HAZARDS:
            return getHazards();
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
        case CimPackage.INCIDENT__CAUSE:
            setCause( ( String ) newValue );
            return;
        case CimPackage.INCIDENT__WORKS:
            getWorks().clear();
            getWorks().addAll( ( Collection< ? extends Work > ) newValue );
            return;
        case CimPackage.INCIDENT__OUTAGE:
            setOutage( ( Outage ) newValue );
            return;
        case CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS:
            getCustomerNotifications().clear();
            getCustomerNotifications().addAll( ( Collection< ? extends CustomerNotification > ) newValue );
            return;
        case CimPackage.INCIDENT__TROUBLE_TICKETS:
            getTroubleTickets().clear();
            getTroubleTickets().addAll( ( Collection< ? extends TroubleTicket > ) newValue );
            return;
        case CimPackage.INCIDENT__LOCATION:
            setLocation( ( Location ) newValue );
            return;
        case CimPackage.INCIDENT__OWNER:
            setOwner( ( Operator ) newValue );
            return;
        case CimPackage.INCIDENT__HAZARDS:
            getHazards().clear();
            getHazards().addAll( ( Collection< ? extends IncidentHazard > ) newValue );
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
        case CimPackage.INCIDENT__CAUSE:
            unsetCause();
            return;
        case CimPackage.INCIDENT__WORKS:
            unsetWorks();
            return;
        case CimPackage.INCIDENT__OUTAGE:
            unsetOutage();
            return;
        case CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS:
            unsetCustomerNotifications();
            return;
        case CimPackage.INCIDENT__TROUBLE_TICKETS:
            unsetTroubleTickets();
            return;
        case CimPackage.INCIDENT__LOCATION:
            unsetLocation();
            return;
        case CimPackage.INCIDENT__OWNER:
            unsetOwner();
            return;
        case CimPackage.INCIDENT__HAZARDS:
            unsetHazards();
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
        case CimPackage.INCIDENT__CAUSE:
            return isSetCause();
        case CimPackage.INCIDENT__WORKS:
            return isSetWorks();
        case CimPackage.INCIDENT__OUTAGE:
            return isSetOutage();
        case CimPackage.INCIDENT__CUSTOMER_NOTIFICATIONS:
            return isSetCustomerNotifications();
        case CimPackage.INCIDENT__TROUBLE_TICKETS:
            return isSetTroubleTickets();
        case CimPackage.INCIDENT__LOCATION:
            return isSetLocation();
        case CimPackage.INCIDENT__OWNER:
            return isSetOwner();
        case CimPackage.INCIDENT__HAZARDS:
            return isSetHazards();
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
        result.append( " (cause: " );
        if( causeESet )
            result.append( cause );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //IncidentImpl
