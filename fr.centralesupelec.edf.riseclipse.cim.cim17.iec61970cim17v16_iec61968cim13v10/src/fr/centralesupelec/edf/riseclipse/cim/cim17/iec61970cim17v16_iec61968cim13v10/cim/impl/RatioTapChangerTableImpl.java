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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTable;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChangerTablePoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio Tap Changer Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RatioTapChangerTableImpl#getRatioTapChangerTablePoint <em>Ratio Tap Changer Table Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RatioTapChangerTableImpl#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioTapChangerTableImpl extends IdentifiedObjectImpl implements RatioTapChangerTable {
    /**
     * The cached value of the '{@link #getRatioTapChangerTablePoint() <em>Ratio Tap Changer Table Point</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatioTapChangerTablePoint()
     * @generated
     * @ordered
     */
    protected EList< RatioTapChangerTablePoint > ratioTapChangerTablePoint;

    /**
     * The cached value of the '{@link #getRatioTapChanger() <em>Ratio Tap Changer</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatioTapChanger()
     * @generated
     * @ordered
     */
    protected EList< RatioTapChanger > ratioTapChanger;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RatioTapChangerTableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRatioTapChangerTable();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RatioTapChangerTablePoint > getRatioTapChangerTablePoint() {
        if( ratioTapChangerTablePoint == null ) {
            ratioTapChangerTablePoint = new EObjectWithInverseResolvingEList.Unsettable< RatioTapChangerTablePoint >(
                    RatioTapChangerTablePoint.class, this,
                    CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT,
                    CimPackage.RATIO_TAP_CHANGER_TABLE_POINT__RATIO_TAP_CHANGER_TABLE );
        }
        return ratioTapChangerTablePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatioTapChangerTablePoint() {
        if( ratioTapChangerTablePoint != null ) ( ( InternalEList.Unsettable< ? > ) ratioTapChangerTablePoint ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatioTapChangerTablePoint() {
        return ratioTapChangerTablePoint != null
                && ( ( InternalEList.Unsettable< ? > ) ratioTapChangerTablePoint ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RatioTapChanger > getRatioTapChanger() {
        if( ratioTapChanger == null ) {
            ratioTapChanger = new EObjectWithInverseResolvingEList.Unsettable< RatioTapChanger >( RatioTapChanger.class,
                    this, CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER,
                    CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE );
        }
        return ratioTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatioTapChanger() {
        if( ratioTapChanger != null ) ( ( InternalEList.Unsettable< ? > ) ratioTapChanger ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatioTapChanger() {
        return ratioTapChanger != null && ( ( InternalEList.Unsettable< ? > ) ratioTapChanger ).isSet();
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRatioTapChangerTablePoint() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRatioTapChanger() )
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT:
            return ( ( InternalEList< ? > ) getRatioTapChangerTablePoint() ).basicRemove( otherEnd, msgs );
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER:
            return ( ( InternalEList< ? > ) getRatioTapChanger() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT:
            return getRatioTapChangerTablePoint();
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER:
            return getRatioTapChanger();
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT:
            getRatioTapChangerTablePoint().clear();
            getRatioTapChangerTablePoint().addAll( ( Collection< ? extends RatioTapChangerTablePoint > ) newValue );
            return;
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER:
            getRatioTapChanger().clear();
            getRatioTapChanger().addAll( ( Collection< ? extends RatioTapChanger > ) newValue );
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT:
            unsetRatioTapChangerTablePoint();
            return;
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER:
            unsetRatioTapChanger();
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
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER_TABLE_POINT:
            return isSetRatioTapChangerTablePoint();
        case CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER:
            return isSetRatioTapChanger();
        }
        return super.eIsSet( featureID );
    }

} //RatioTapChangerTableImpl
