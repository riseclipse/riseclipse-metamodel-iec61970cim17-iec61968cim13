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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incident Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentHazardImpl#getIncident <em>Incident</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.IncidentHazardImpl#getTroubleTicket <em>Trouble Ticket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncidentHazardImpl extends HazardImpl implements IncidentHazard {
    /**
     * The cached value of the '{@link #getIncident() <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncident()
     * @generated
     * @ordered
     */
    protected Incident incident;

    /**
     * This is true if the Incident reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean incidentESet;

    /**
     * The cached value of the '{@link #getTroubleTicket() <em>Trouble Ticket</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTroubleTicket()
     * @generated
     * @ordered
     */
    protected TroubleTicket troubleTicket;

    /**
     * This is true if the Trouble Ticket reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean troubleTicketESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IncidentHazardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getIncidentHazard();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Incident getIncident() {
        return incident;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncident( Incident newIncident, NotificationChain msgs ) {
        Incident oldIncident = incident;
        incident = newIncident;
        boolean oldIncidentESet = incidentESet;
        incidentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCIDENT_HAZARD__INCIDENT, oldIncident, newIncident, !oldIncidentESet );
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
    public void setIncident( Incident newIncident ) {
        if( newIncident != incident ) {
            NotificationChain msgs = null;
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__HAZARDS, Incident.class, msgs );
            if( newIncident != null ) msgs = ( ( InternalEObject ) newIncident ).eInverseAdd( this,
                    CimPackage.INCIDENT__HAZARDS, Incident.class, msgs );
            msgs = basicSetIncident( newIncident, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCIDENT_HAZARD__INCIDENT, newIncident, newIncident, !oldIncidentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIncident( NotificationChain msgs ) {
        Incident oldIncident = incident;
        incident = null;
        boolean oldIncidentESet = incidentESet;
        incidentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT_HAZARD__INCIDENT, oldIncident, null, oldIncidentESet );
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
    public void unsetIncident() {
        if( incident != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) incident ).eInverseRemove( this, CimPackage.INCIDENT__HAZARDS, Incident.class,
                    msgs );
            msgs = basicUnsetIncident( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIncidentESet = incidentESet;
            incidentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT_HAZARD__INCIDENT, null, null, oldIncidentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIncident() {
        return incidentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TroubleTicket getTroubleTicket() {
        return troubleTicket;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTroubleTicket( TroubleTicket newTroubleTicket, NotificationChain msgs ) {
        TroubleTicket oldTroubleTicket = troubleTicket;
        troubleTicket = newTroubleTicket;
        boolean oldTroubleTicketESet = troubleTicketESet;
        troubleTicketESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET, oldTroubleTicket, newTroubleTicket,
                    !oldTroubleTicketESet );
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
    public void setTroubleTicket( TroubleTicket newTroubleTicket ) {
        if( newTroubleTicket != troubleTicket ) {
            NotificationChain msgs = null;
            if( troubleTicket != null ) msgs = ( ( InternalEObject ) troubleTicket ).eInverseRemove( this,
                    CimPackage.TROUBLE_TICKET__HAZARDS, TroubleTicket.class, msgs );
            if( newTroubleTicket != null ) msgs = ( ( InternalEObject ) newTroubleTicket ).eInverseAdd( this,
                    CimPackage.TROUBLE_TICKET__HAZARDS, TroubleTicket.class, msgs );
            msgs = basicSetTroubleTicket( newTroubleTicket, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTroubleTicketESet = troubleTicketESet;
            troubleTicketESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET,
                        newTroubleTicket, newTroubleTicket, !oldTroubleTicketESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTroubleTicket( NotificationChain msgs ) {
        TroubleTicket oldTroubleTicket = troubleTicket;
        troubleTicket = null;
        boolean oldTroubleTicketESet = troubleTicketESet;
        troubleTicketESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET, oldTroubleTicket, null, oldTroubleTicketESet );
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
    public void unsetTroubleTicket() {
        if( troubleTicket != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) troubleTicket ).eInverseRemove( this, CimPackage.TROUBLE_TICKET__HAZARDS,
                    TroubleTicket.class, msgs );
            msgs = basicUnsetTroubleTicket( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTroubleTicketESet = troubleTicketESet;
            troubleTicketESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET, null, null, oldTroubleTicketESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTroubleTicket() {
        return troubleTicketESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.INCIDENT_HAZARD__INCIDENT:
            if( incident != null ) msgs = ( ( InternalEObject ) incident ).eInverseRemove( this,
                    CimPackage.INCIDENT__HAZARDS, Incident.class, msgs );
            return basicSetIncident( ( Incident ) otherEnd, msgs );
        case CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET:
            if( troubleTicket != null ) msgs = ( ( InternalEObject ) troubleTicket ).eInverseRemove( this,
                    CimPackage.TROUBLE_TICKET__HAZARDS, TroubleTicket.class, msgs );
            return basicSetTroubleTicket( ( TroubleTicket ) otherEnd, msgs );
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
        case CimPackage.INCIDENT_HAZARD__INCIDENT:
            return basicUnsetIncident( msgs );
        case CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET:
            return basicUnsetTroubleTicket( msgs );
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
        case CimPackage.INCIDENT_HAZARD__INCIDENT:
            return getIncident();
        case CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET:
            return getTroubleTicket();
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
        case CimPackage.INCIDENT_HAZARD__INCIDENT:
            setIncident( ( Incident ) newValue );
            return;
        case CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET:
            setTroubleTicket( ( TroubleTicket ) newValue );
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
        case CimPackage.INCIDENT_HAZARD__INCIDENT:
            unsetIncident();
            return;
        case CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET:
            unsetTroubleTicket();
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
        case CimPackage.INCIDENT_HAZARD__INCIDENT:
            return isSetIncident();
        case CimPackage.INCIDENT_HAZARD__TROUBLE_TICKET:
            return isSetTroubleTicket();
        }
        return super.eIsSet( featureID );
    }

} //IncidentHazardImpl
