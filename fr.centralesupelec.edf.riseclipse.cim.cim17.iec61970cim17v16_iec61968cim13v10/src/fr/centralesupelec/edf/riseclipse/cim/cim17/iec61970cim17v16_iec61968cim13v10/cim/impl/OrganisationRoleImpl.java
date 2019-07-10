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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrganisationRole;

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
 * An implementation of the model object '<em><b>Organisation Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationRoleImpl#getConfigurationEvents <em>Configuration Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.OrganisationRoleImpl#getOrganisation <em>Organisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationRoleImpl extends IdentifiedObjectImpl implements OrganisationRole {
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
     * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrganisation()
     * @generated
     * @ordered
     */
    protected Organisation organisation;

    /**
     * This is true if the Organisation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean organisationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OrganisationRoleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOrganisationRole();
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
                    ConfigurationEvent.class, this, CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_ORGANISATION_ROLE );
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
    @Override
    public Organisation getOrganisation() {
        return organisation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOrganisation( Organisation newOrganisation, NotificationChain msgs ) {
        Organisation oldOrganisation = organisation;
        organisation = newOrganisation;
        boolean oldOrganisationESet = organisationESet;
        organisationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ORGANISATION_ROLE__ORGANISATION, oldOrganisation, newOrganisation,
                    !oldOrganisationESet );
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
    public void setOrganisation( Organisation newOrganisation ) {
        if( newOrganisation != organisation ) {
            NotificationChain msgs = null;
            if( organisation != null ) msgs = ( ( InternalEObject ) organisation ).eInverseRemove( this,
                    CimPackage.ORGANISATION__ROLES, Organisation.class, msgs );
            if( newOrganisation != null ) msgs = ( ( InternalEObject ) newOrganisation ).eInverseAdd( this,
                    CimPackage.ORGANISATION__ROLES, Organisation.class, msgs );
            msgs = basicSetOrganisation( newOrganisation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOrganisationESet = organisationESet;
            organisationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ORGANISATION_ROLE__ORGANISATION,
                        newOrganisation, newOrganisation, !oldOrganisationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOrganisation( NotificationChain msgs ) {
        Organisation oldOrganisation = organisation;
        organisation = null;
        boolean oldOrganisationESet = organisationESet;
        organisationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION_ROLE__ORGANISATION, oldOrganisation, null, oldOrganisationESet );
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
    public void unsetOrganisation() {
        if( organisation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) organisation ).eInverseRemove( this, CimPackage.ORGANISATION__ROLES,
                    Organisation.class, msgs );
            msgs = basicUnsetOrganisation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOrganisationESet = organisationESet;
            organisationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ORGANISATION_ROLE__ORGANISATION, null, null, oldOrganisationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOrganisation() {
        return organisationESet;
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
        case CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConfigurationEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ORGANISATION_ROLE__ORGANISATION:
            if( organisation != null ) msgs = ( ( InternalEObject ) organisation ).eInverseRemove( this,
                    CimPackage.ORGANISATION__ROLES, Organisation.class, msgs );
            return basicSetOrganisation( ( Organisation ) otherEnd, msgs );
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
        case CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS:
            return ( ( InternalEList< ? > ) getConfigurationEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.ORGANISATION_ROLE__ORGANISATION:
            return basicUnsetOrganisation( msgs );
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
        case CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS:
            return getConfigurationEvents();
        case CimPackage.ORGANISATION_ROLE__ORGANISATION:
            return getOrganisation();
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
        case CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS:
            getConfigurationEvents().clear();
            getConfigurationEvents().addAll( ( Collection< ? extends ConfigurationEvent > ) newValue );
            return;
        case CimPackage.ORGANISATION_ROLE__ORGANISATION:
            setOrganisation( ( Organisation ) newValue );
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
        case CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS:
            unsetConfigurationEvents();
            return;
        case CimPackage.ORGANISATION_ROLE__ORGANISATION:
            unsetOrganisation();
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
        case CimPackage.ORGANISATION_ROLE__CONFIGURATION_EVENTS:
            return isSetConfigurationEvents();
        case CimPackage.ORGANISATION_ROLE__ORGANISATION:
            return isSetOrganisation();
        }
        return super.eIsSet( featureID );
    }

} //OrganisationRoleImpl
