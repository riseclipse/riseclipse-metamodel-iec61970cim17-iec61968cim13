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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Crew;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStep;

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
 * An implementation of the model object '<em><b>Crew Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CrewMemberImpl#getSwitchingSteps <em>Switching Steps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CrewMemberImpl#getCrew <em>Crew</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrewMemberImpl extends OperationPersonRoleImpl implements CrewMember {
    /**
     * The cached value of the '{@link #getSwitchingSteps() <em>Switching Steps</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingSteps()
     * @generated
     * @ordered
     */
    protected EList< SwitchingStep > switchingSteps;

    /**
     * The cached value of the '{@link #getCrew() <em>Crew</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrew()
     * @generated
     * @ordered
     */
    protected Crew crew;

    /**
     * This is true if the Crew reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crewESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrewMemberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCrewMember();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchingStep > getSwitchingSteps() {
        if( switchingSteps == null ) {
            switchingSteps = new EObjectWithInverseResolvingEList.Unsettable< SwitchingStep >( SwitchingStep.class,
                    this, CimPackage.CREW_MEMBER__SWITCHING_STEPS, CimPackage.SWITCHING_STEP__CREW_MEMBER );
        }
        return switchingSteps;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchingSteps() {
        if( switchingSteps != null ) ( ( InternalEList.Unsettable< ? > ) switchingSteps ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingSteps() {
        return switchingSteps != null && ( ( InternalEList.Unsettable< ? > ) switchingSteps ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Crew getCrew() {
        return crew;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCrew( Crew newCrew, NotificationChain msgs ) {
        Crew oldCrew = crew;
        crew = newCrew;
        boolean oldCrewESet = crewESet;
        crewESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CREW_MEMBER__CREW, oldCrew, newCrew, !oldCrewESet );
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
    public void setCrew( Crew newCrew ) {
        if( newCrew != crew ) {
            NotificationChain msgs = null;
            if( crew != null ) msgs = ( ( InternalEObject ) crew ).eInverseRemove( this, CimPackage.CREW__CREW_MEMBERS,
                    Crew.class, msgs );
            if( newCrew != null ) msgs = ( ( InternalEObject ) newCrew ).eInverseAdd( this,
                    CimPackage.CREW__CREW_MEMBERS, Crew.class, msgs );
            msgs = basicSetCrew( newCrew, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCrewESet = crewESet;
            crewESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CREW_MEMBER__CREW, newCrew, newCrew, !oldCrewESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCrew( NotificationChain msgs ) {
        Crew oldCrew = crew;
        crew = null;
        boolean oldCrewESet = crewESet;
        crewESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CREW_MEMBER__CREW, oldCrew, null, oldCrewESet );
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
    public void unsetCrew() {
        if( crew != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) crew ).eInverseRemove( this, CimPackage.CREW__CREW_MEMBERS, Crew.class, msgs );
            msgs = basicUnsetCrew( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCrewESet = crewESet;
            crewESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CREW_MEMBER__CREW, null, null, oldCrewESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrew() {
        return crewESet;
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
        case CimPackage.CREW_MEMBER__SWITCHING_STEPS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchingSteps() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CREW_MEMBER__CREW:
            if( crew != null ) msgs = ( ( InternalEObject ) crew ).eInverseRemove( this, CimPackage.CREW__CREW_MEMBERS,
                    Crew.class, msgs );
            return basicSetCrew( ( Crew ) otherEnd, msgs );
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
        case CimPackage.CREW_MEMBER__SWITCHING_STEPS:
            return ( ( InternalEList< ? > ) getSwitchingSteps() ).basicRemove( otherEnd, msgs );
        case CimPackage.CREW_MEMBER__CREW:
            return basicUnsetCrew( msgs );
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
        case CimPackage.CREW_MEMBER__SWITCHING_STEPS:
            return getSwitchingSteps();
        case CimPackage.CREW_MEMBER__CREW:
            return getCrew();
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
        case CimPackage.CREW_MEMBER__SWITCHING_STEPS:
            getSwitchingSteps().clear();
            getSwitchingSteps().addAll( ( Collection< ? extends SwitchingStep > ) newValue );
            return;
        case CimPackage.CREW_MEMBER__CREW:
            setCrew( ( Crew ) newValue );
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
        case CimPackage.CREW_MEMBER__SWITCHING_STEPS:
            unsetSwitchingSteps();
            return;
        case CimPackage.CREW_MEMBER__CREW:
            unsetCrew();
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
        case CimPackage.CREW_MEMBER__SWITCHING_STEPS:
            return isSetSwitchingSteps();
        case CimPackage.CREW_MEMBER__CREW:
            return isSetCrew();
        }
        return super.eIsSet( featureID );
    }

} //CrewMemberImpl
