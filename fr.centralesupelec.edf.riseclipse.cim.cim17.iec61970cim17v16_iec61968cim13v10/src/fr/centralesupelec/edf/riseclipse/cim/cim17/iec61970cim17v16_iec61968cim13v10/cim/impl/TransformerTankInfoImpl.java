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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo;

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
 * An implementation of the model object '<em><b>Transformer Tank Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerTankInfoImpl#getTransformerEndInfos <em>Transformer End Infos</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerTankInfoImpl#getPowerTransformerInfo <em>Power Transformer Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerTankInfoImpl extends AssetInfoImpl implements TransformerTankInfo {
    /**
     * The cached value of the '{@link #getTransformerEndInfos() <em>Transformer End Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerEndInfos()
     * @generated
     * @ordered
     */
    protected EList< TransformerEndInfo > transformerEndInfos;

    /**
     * The cached value of the '{@link #getPowerTransformerInfo() <em>Power Transformer Info</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerTransformerInfo()
     * @generated
     * @ordered
     */
    protected PowerTransformerInfo powerTransformerInfo;

    /**
     * This is true if the Power Transformer Info reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerTransformerInfoESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformerTankInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerTankInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerEndInfo > getTransformerEndInfos() {
        if( transformerEndInfos == null ) {
            transformerEndInfos = new EObjectWithInverseResolvingEList.Unsettable< TransformerEndInfo >(
                    TransformerEndInfo.class, this, CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS,
                    CimPackage.TRANSFORMER_END_INFO__TRANSFORMER_TANK_INFO );
        }
        return transformerEndInfos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerEndInfos() {
        if( transformerEndInfos != null ) ( ( InternalEList.Unsettable< ? > ) transformerEndInfos ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerEndInfos() {
        return transformerEndInfos != null && ( ( InternalEList.Unsettable< ? > ) transformerEndInfos ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformerInfo getPowerTransformerInfo() {
        return powerTransformerInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerTransformerInfo( PowerTransformerInfo newPowerTransformerInfo,
            NotificationChain msgs ) {
        PowerTransformerInfo oldPowerTransformerInfo = powerTransformerInfo;
        powerTransformerInfo = newPowerTransformerInfo;
        boolean oldPowerTransformerInfoESet = powerTransformerInfoESet;
        powerTransformerInfoESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO, oldPowerTransformerInfo,
                    newPowerTransformerInfo, !oldPowerTransformerInfoESet );
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
    public void setPowerTransformerInfo( PowerTransformerInfo newPowerTransformerInfo ) {
        if( newPowerTransformerInfo != powerTransformerInfo ) {
            NotificationChain msgs = null;
            if( powerTransformerInfo != null ) msgs = ( ( InternalEObject ) powerTransformerInfo ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS, PowerTransformerInfo.class, msgs );
            if( newPowerTransformerInfo != null )
                msgs = ( ( InternalEObject ) newPowerTransformerInfo ).eInverseAdd( this,
                        CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS, PowerTransformerInfo.class, msgs );
            msgs = basicSetPowerTransformerInfo( newPowerTransformerInfo, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerTransformerInfoESet = powerTransformerInfoESet;
            powerTransformerInfoESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO, newPowerTransformerInfo,
                    newPowerTransformerInfo, !oldPowerTransformerInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerTransformerInfo( NotificationChain msgs ) {
        PowerTransformerInfo oldPowerTransformerInfo = powerTransformerInfo;
        powerTransformerInfo = null;
        boolean oldPowerTransformerInfoESet = powerTransformerInfoESet;
        powerTransformerInfoESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO, oldPowerTransformerInfo, null,
                    oldPowerTransformerInfoESet );
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
    public void unsetPowerTransformerInfo() {
        if( powerTransformerInfo != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerTransformerInfo ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS, PowerTransformerInfo.class, msgs );
            msgs = basicUnsetPowerTransformerInfo( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerTransformerInfoESet = powerTransformerInfoESet;
            powerTransformerInfoESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO, null, null,
                    oldPowerTransformerInfoESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerTransformerInfo() {
        return powerTransformerInfoESet;
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
        case CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerEndInfos() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
            if( powerTransformerInfo != null ) msgs = ( ( InternalEObject ) powerTransformerInfo ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS, PowerTransformerInfo.class, msgs );
            return basicSetPowerTransformerInfo( ( PowerTransformerInfo ) otherEnd, msgs );
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
        case CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
            return ( ( InternalEList< ? > ) getTransformerEndInfos() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
            return basicUnsetPowerTransformerInfo( msgs );
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
        case CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
            return getTransformerEndInfos();
        case CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
            return getPowerTransformerInfo();
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
        case CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
            getTransformerEndInfos().clear();
            getTransformerEndInfos().addAll( ( Collection< ? extends TransformerEndInfo > ) newValue );
            return;
        case CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
            setPowerTransformerInfo( ( PowerTransformerInfo ) newValue );
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
        case CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
            unsetTransformerEndInfos();
            return;
        case CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
            unsetPowerTransformerInfo();
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
        case CimPackage.TRANSFORMER_TANK_INFO__TRANSFORMER_END_INFOS:
            return isSetTransformerEndInfos();
        case CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO:
            return isSetPowerTransformerInfo();
        }
        return super.eIsSet( featureID );
    }

} //TransformerTankInfoImpl
