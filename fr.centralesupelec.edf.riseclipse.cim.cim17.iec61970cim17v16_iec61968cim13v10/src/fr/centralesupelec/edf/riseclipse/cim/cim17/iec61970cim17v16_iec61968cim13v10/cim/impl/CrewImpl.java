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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Crew;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkAsset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask;

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
 * An implementation of the model object '<em><b>Crew</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CrewImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CrewImpl#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CrewImpl#getWorkAssets <em>Work Assets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CrewImpl#getCrewMembers <em>Crew Members</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CrewImpl#getCrewType <em>Crew Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrewImpl extends IdentifiedObjectImpl implements Crew {
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
     * The cached value of the '{@link #getWorkTasks() <em>Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkTasks()
     * @generated
     * @ordered
     */
    protected EList< WorkTask > workTasks;

    /**
     * The cached value of the '{@link #getWorkAssets() <em>Work Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWorkAssets()
     * @generated
     * @ordered
     */
    protected EList< WorkAsset > workAssets;

    /**
     * The cached value of the '{@link #getCrewMembers() <em>Crew Members</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrewMembers()
     * @generated
     * @ordered
     */
    protected EList< CrewMember > crewMembers;

    /**
     * The cached value of the '{@link #getCrewType() <em>Crew Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrewType()
     * @generated
     * @ordered
     */
    protected CrewType crewType;

    /**
     * This is true if the Crew Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crewTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CrewImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCrew();
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.CREW__STATUS,
                    oldStatus, newStatus, !oldStatusESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.CREW__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.CREW__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CREW__STATUS, newStatus, newStatus, !oldStatusESet ) );
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET, CimPackage.CREW__STATUS,
                    oldStatus, null, oldStatusESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.CREW__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CREW__STATUS, null, null, oldStatusESet ) );
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
    public EList< WorkTask > getWorkTasks() {
        if( workTasks == null ) {
            workTasks = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< WorkTask >( WorkTask.class, this,
                    CimPackage.CREW__WORK_TASKS, CimPackage.WORK_TASK__CREWS );
        }
        return workTasks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkTasks() {
        if( workTasks != null ) ( ( InternalEList.Unsettable< ? > ) workTasks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkTasks() {
        return workTasks != null && ( ( InternalEList.Unsettable< ? > ) workTasks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WorkAsset > getWorkAssets() {
        if( workAssets == null ) {
            workAssets = new EObjectWithInverseResolvingEList.Unsettable< WorkAsset >( WorkAsset.class, this,
                    CimPackage.CREW__WORK_ASSETS, CimPackage.WORK_ASSET__CREW );
        }
        return workAssets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWorkAssets() {
        if( workAssets != null ) ( ( InternalEList.Unsettable< ? > ) workAssets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWorkAssets() {
        return workAssets != null && ( ( InternalEList.Unsettable< ? > ) workAssets ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CrewMember > getCrewMembers() {
        if( crewMembers == null ) {
            crewMembers = new EObjectWithInverseResolvingEList.Unsettable< CrewMember >( CrewMember.class, this,
                    CimPackage.CREW__CREW_MEMBERS, CimPackage.CREW_MEMBER__CREW );
        }
        return crewMembers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCrewMembers() {
        if( crewMembers != null ) ( ( InternalEList.Unsettable< ? > ) crewMembers ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrewMembers() {
        return crewMembers != null && ( ( InternalEList.Unsettable< ? > ) crewMembers ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrewType getCrewType() {
        return crewType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCrewType( CrewType newCrewType, NotificationChain msgs ) {
        CrewType oldCrewType = crewType;
        crewType = newCrewType;
        boolean oldCrewTypeESet = crewTypeESet;
        crewTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.CREW__CREW_TYPE,
                    oldCrewType, newCrewType, !oldCrewTypeESet );
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
    public void setCrewType( CrewType newCrewType ) {
        if( newCrewType != crewType ) {
            NotificationChain msgs = null;
            if( crewType != null ) msgs = ( ( InternalEObject ) crewType ).eInverseRemove( this,
                    CimPackage.CREW_TYPE__CREWS, CrewType.class, msgs );
            if( newCrewType != null ) msgs = ( ( InternalEObject ) newCrewType ).eInverseAdd( this,
                    CimPackage.CREW_TYPE__CREWS, CrewType.class, msgs );
            msgs = basicSetCrewType( newCrewType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCrewTypeESet = crewTypeESet;
            crewTypeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CREW__CREW_TYPE, newCrewType, newCrewType, !oldCrewTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCrewType( NotificationChain msgs ) {
        CrewType oldCrewType = crewType;
        crewType = null;
        boolean oldCrewTypeESet = crewTypeESet;
        crewTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CREW__CREW_TYPE, oldCrewType, null, oldCrewTypeESet );
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
    public void unsetCrewType() {
        if( crewType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) crewType ).eInverseRemove( this, CimPackage.CREW_TYPE__CREWS, CrewType.class,
                    msgs );
            msgs = basicUnsetCrewType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCrewTypeESet = crewTypeESet;
            crewTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CREW__CREW_TYPE, null, null, oldCrewTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrewType() {
        return crewTypeESet;
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
        case CimPackage.CREW__WORK_TASKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorkTasks() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CREW__WORK_ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWorkAssets() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CREW__CREW_MEMBERS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCrewMembers() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CREW__CREW_TYPE:
            if( crewType != null ) msgs = ( ( InternalEObject ) crewType ).eInverseRemove( this,
                    CimPackage.CREW_TYPE__CREWS, CrewType.class, msgs );
            return basicSetCrewType( ( CrewType ) otherEnd, msgs );
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
        case CimPackage.CREW__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.CREW__WORK_TASKS:
            return ( ( InternalEList< ? > ) getWorkTasks() ).basicRemove( otherEnd, msgs );
        case CimPackage.CREW__WORK_ASSETS:
            return ( ( InternalEList< ? > ) getWorkAssets() ).basicRemove( otherEnd, msgs );
        case CimPackage.CREW__CREW_MEMBERS:
            return ( ( InternalEList< ? > ) getCrewMembers() ).basicRemove( otherEnd, msgs );
        case CimPackage.CREW__CREW_TYPE:
            return basicUnsetCrewType( msgs );
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
        case CimPackage.CREW__STATUS:
            return getStatus();
        case CimPackage.CREW__WORK_TASKS:
            return getWorkTasks();
        case CimPackage.CREW__WORK_ASSETS:
            return getWorkAssets();
        case CimPackage.CREW__CREW_MEMBERS:
            return getCrewMembers();
        case CimPackage.CREW__CREW_TYPE:
            return getCrewType();
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
        case CimPackage.CREW__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.CREW__WORK_TASKS:
            getWorkTasks().clear();
            getWorkTasks().addAll( ( Collection< ? extends WorkTask > ) newValue );
            return;
        case CimPackage.CREW__WORK_ASSETS:
            getWorkAssets().clear();
            getWorkAssets().addAll( ( Collection< ? extends WorkAsset > ) newValue );
            return;
        case CimPackage.CREW__CREW_MEMBERS:
            getCrewMembers().clear();
            getCrewMembers().addAll( ( Collection< ? extends CrewMember > ) newValue );
            return;
        case CimPackage.CREW__CREW_TYPE:
            setCrewType( ( CrewType ) newValue );
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
        case CimPackage.CREW__STATUS:
            unsetStatus();
            return;
        case CimPackage.CREW__WORK_TASKS:
            unsetWorkTasks();
            return;
        case CimPackage.CREW__WORK_ASSETS:
            unsetWorkAssets();
            return;
        case CimPackage.CREW__CREW_MEMBERS:
            unsetCrewMembers();
            return;
        case CimPackage.CREW__CREW_TYPE:
            unsetCrewType();
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
        case CimPackage.CREW__STATUS:
            return isSetStatus();
        case CimPackage.CREW__WORK_TASKS:
            return isSetWorkTasks();
        case CimPackage.CREW__WORK_ASSETS:
            return isSetWorkAssets();
        case CimPackage.CREW__CREW_MEMBERS:
            return isSetCrewMembers();
        case CimPackage.CREW__CREW_TYPE:
            return isSetCrewType();
        }
        return super.eIsSet( featureID );
    }

} //CrewImpl
