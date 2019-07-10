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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenUnitKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGeneratingUnitImpl#getWindGenUnitType <em>Wind Gen Unit Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGeneratingUnitImpl extends GeneratingUnitImpl implements WindGeneratingUnit {
    /**
     * The default value of the '{@link #getWindGenUnitType() <em>Wind Gen Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenUnitType()
     * @generated
     * @ordered
     */
    protected static final WindGenUnitKind WIND_GEN_UNIT_TYPE_EDEFAULT = WindGenUnitKind.OFFSHORE;

    /**
     * The cached value of the '{@link #getWindGenUnitType() <em>Wind Gen Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenUnitType()
     * @generated
     * @ordered
     */
    protected WindGenUnitKind windGenUnitType = WIND_GEN_UNIT_TYPE_EDEFAULT;

    /**
     * This is true if the Wind Gen Unit Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenUnitTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenUnitKind getWindGenUnitType() {
        return windGenUnitType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindGenUnitType( WindGenUnitKind newWindGenUnitType ) {
        WindGenUnitKind oldWindGenUnitType = windGenUnitType;
        windGenUnitType = newWindGenUnitType == null ? WIND_GEN_UNIT_TYPE_EDEFAULT : newWindGenUnitType;
        boolean oldWindGenUnitTypeESet = windGenUnitTypeESet;
        windGenUnitTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE,
                    oldWindGenUnitType, windGenUnitType, !oldWindGenUnitTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindGenUnitType() {
        WindGenUnitKind oldWindGenUnitType = windGenUnitType;
        boolean oldWindGenUnitTypeESet = windGenUnitTypeESet;
        windGenUnitType = WIND_GEN_UNIT_TYPE_EDEFAULT;
        windGenUnitTypeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE,
                        oldWindGenUnitType, WIND_GEN_UNIT_TYPE_EDEFAULT, oldWindGenUnitTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenUnitType() {
        return windGenUnitTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE:
            return getWindGenUnitType();
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
        case CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE:
            setWindGenUnitType( ( WindGenUnitKind ) newValue );
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
        case CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE:
            unsetWindGenUnitType();
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
        case CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE:
            return isSetWindGenUnitType();
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (windGenUnitType: " );
        if( windGenUnitTypeESet )
            result.append( windGenUnitType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindGeneratingUnitImpl
