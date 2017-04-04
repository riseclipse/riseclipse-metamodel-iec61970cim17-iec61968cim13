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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTankInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Transformer Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerInfoImpl#getTransformerTankInfos <em>Transformer Tank Infos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerTransformerInfoImpl extends AssetInfoImpl implements PowerTransformerInfo {
    /**
     * The cached value of the '{@link #getTransformerTankInfos() <em>Transformer Tank Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerTankInfos()
     * @generated
     * @ordered
     */
    protected EList< TransformerTankInfo > transformerTankInfos;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerTransformerInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerTransformerInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerTankInfo > getTransformerTankInfos() {
        if( transformerTankInfos == null ) {
            transformerTankInfos = new EObjectWithInverseResolvingEList.Unsettable< TransformerTankInfo >(
                    TransformerTankInfo.class, this, CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS,
                    CimPackage.TRANSFORMER_TANK_INFO__POWER_TRANSFORMER_INFO );
        }
        return transformerTankInfos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerTankInfos() {
        if( transformerTankInfos != null ) ( ( InternalEList.Unsettable< ? > ) transformerTankInfos ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerTankInfos() {
        return transformerTankInfos != null && ( ( InternalEList.Unsettable< ? > ) transformerTankInfos ).isSet();
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
        case CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerTankInfos() )
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
        case CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS:
            return ( ( InternalEList< ? > ) getTransformerTankInfos() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS:
            return getTransformerTankInfos();
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
        case CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS:
            getTransformerTankInfos().clear();
            getTransformerTankInfos().addAll( ( Collection< ? extends TransformerTankInfo > ) newValue );
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
        case CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS:
            unsetTransformerTankInfos();
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
        case CimPackage.POWER_TRANSFORMER_INFO__TRANSFORMER_TANK_INFOS:
            return isSetTransformerTankInfos();
        }
        return super.eIsSet( featureID );
    }

} //PowerTransformerInfoImpl
