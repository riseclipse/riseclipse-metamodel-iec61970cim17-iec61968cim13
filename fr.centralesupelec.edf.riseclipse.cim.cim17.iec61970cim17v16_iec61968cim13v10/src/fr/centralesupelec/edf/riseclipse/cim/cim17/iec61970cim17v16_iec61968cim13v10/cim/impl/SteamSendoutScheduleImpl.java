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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSendoutSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Steam Sendout Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamSendoutScheduleImpl#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SteamSendoutScheduleImpl extends RegularIntervalScheduleImpl implements SteamSendoutSchedule {
    /**
     * The cached value of the '{@link #getCogenerationPlant() <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenerationPlant()
     * @generated
     * @ordered
     */
    protected CogenerationPlant cogenerationPlant;

    /**
     * This is true if the Cogeneration Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cogenerationPlantESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SteamSendoutScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSteamSendoutSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CogenerationPlant getCogenerationPlant() {
        if( cogenerationPlant != null && cogenerationPlant.eIsProxy() ) {
            InternalEObject oldCogenerationPlant = ( InternalEObject ) cogenerationPlant;
            cogenerationPlant = ( CogenerationPlant ) eResolveProxy( oldCogenerationPlant );
            if( cogenerationPlant != oldCogenerationPlant ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, oldCogenerationPlant,
                        cogenerationPlant ) );
            }
        }
        return cogenerationPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CogenerationPlant basicGetCogenerationPlant() {
        return cogenerationPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCogenerationPlant( CogenerationPlant newCogenerationPlant,
            NotificationChain msgs ) {
        CogenerationPlant oldCogenerationPlant = cogenerationPlant;
        cogenerationPlant = newCogenerationPlant;
        boolean oldCogenerationPlantESet = cogenerationPlantESet;
        cogenerationPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, oldCogenerationPlant, newCogenerationPlant,
                    !oldCogenerationPlantESet );
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
    public void setCogenerationPlant( CogenerationPlant newCogenerationPlant ) {
        if( newCogenerationPlant != cogenerationPlant ) {
            NotificationChain msgs = null;
            if( cogenerationPlant != null ) msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                    CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs );
            if( newCogenerationPlant != null ) msgs = ( ( InternalEObject ) newCogenerationPlant ).eInverseAdd( this,
                    CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs );
            msgs = basicSetCogenerationPlant( newCogenerationPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCogenerationPlantESet = cogenerationPlantESet;
            cogenerationPlantESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, newCogenerationPlant, newCogenerationPlant,
                    !oldCogenerationPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCogenerationPlant( NotificationChain msgs ) {
        CogenerationPlant oldCogenerationPlant = cogenerationPlant;
        cogenerationPlant = null;
        boolean oldCogenerationPlantESet = cogenerationPlantESet;
        cogenerationPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, oldCogenerationPlant, null,
                    oldCogenerationPlantESet );
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
    public void unsetCogenerationPlant() {
        if( cogenerationPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                    CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs );
            msgs = basicUnsetCogenerationPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCogenerationPlantESet = cogenerationPlantESet;
            cogenerationPlantESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, null, null, oldCogenerationPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCogenerationPlant() {
        return cogenerationPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
            if( cogenerationPlant != null ) msgs = ( ( InternalEObject ) cogenerationPlant ).eInverseRemove( this,
                    CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, CogenerationPlant.class, msgs );
            return basicSetCogenerationPlant( ( CogenerationPlant ) otherEnd, msgs );
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
        case CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
            return basicUnsetCogenerationPlant( msgs );
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
        case CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
            if( resolve ) return getCogenerationPlant();
            return basicGetCogenerationPlant();
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
        case CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
            setCogenerationPlant( ( CogenerationPlant ) newValue );
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
        case CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
            unsetCogenerationPlant();
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
        case CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT:
            return isSetCogenerationPlant();
        }
        return super.eIsSet( featureID );
    }

} //SteamSendoutScheduleImpl
