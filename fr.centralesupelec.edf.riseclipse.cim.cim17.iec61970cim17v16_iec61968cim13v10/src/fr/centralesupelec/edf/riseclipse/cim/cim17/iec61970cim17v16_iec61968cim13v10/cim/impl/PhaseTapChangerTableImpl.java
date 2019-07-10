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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTable;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTablePoint;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChangerTabular;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Tap Changer Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseTapChangerTableImpl#getPhaseTapChangerTabular <em>Phase Tap Changer Tabular</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseTapChangerTableImpl#getPhaseTapChangerTablePoint <em>Phase Tap Changer Table Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseTapChangerTableImpl extends IdentifiedObjectImpl implements PhaseTapChangerTable {
    /**
     * The cached value of the '{@link #getPhaseTapChangerTabular() <em>Phase Tap Changer Tabular</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseTapChangerTabular()
     * @generated
     * @ordered
     */
    protected EList< PhaseTapChangerTabular > phaseTapChangerTabular;

    /**
     * The cached value of the '{@link #getPhaseTapChangerTablePoint() <em>Phase Tap Changer Table Point</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseTapChangerTablePoint()
     * @generated
     * @ordered
     */
    protected EList< PhaseTapChangerTablePoint > phaseTapChangerTablePoint;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhaseTapChangerTableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPhaseTapChangerTable();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PhaseTapChangerTabular > getPhaseTapChangerTabular() {
        if( phaseTapChangerTabular == null ) {
            phaseTapChangerTabular = new EObjectWithInverseResolvingEList.Unsettable< PhaseTapChangerTabular >(
                    PhaseTapChangerTabular.class, this, CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABULAR,
                    CimPackage.PHASE_TAP_CHANGER_TABULAR__PHASE_TAP_CHANGER_TABLE );
        }
        return phaseTapChangerTabular;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseTapChangerTabular() {
        if( phaseTapChangerTabular != null ) ( ( InternalEList.Unsettable< ? > ) phaseTapChangerTabular ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseTapChangerTabular() {
        return phaseTapChangerTabular != null && ( ( InternalEList.Unsettable< ? > ) phaseTapChangerTabular ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PhaseTapChangerTablePoint > getPhaseTapChangerTablePoint() {
        if( phaseTapChangerTablePoint == null ) {
            phaseTapChangerTablePoint = new EObjectWithInverseResolvingEList.Unsettable< PhaseTapChangerTablePoint >(
                    PhaseTapChangerTablePoint.class, this,
                    CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT,
                    CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE );
        }
        return phaseTapChangerTablePoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseTapChangerTablePoint() {
        if( phaseTapChangerTablePoint != null ) ( ( InternalEList.Unsettable< ? > ) phaseTapChangerTablePoint ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseTapChangerTablePoint() {
        return phaseTapChangerTablePoint != null
                && ( ( InternalEList.Unsettable< ? > ) phaseTapChangerTablePoint ).isSet();
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABULAR:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPhaseTapChangerTabular() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPhaseTapChangerTablePoint() )
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABULAR:
            return ( ( InternalEList< ? > ) getPhaseTapChangerTabular() ).basicRemove( otherEnd, msgs );
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT:
            return ( ( InternalEList< ? > ) getPhaseTapChangerTablePoint() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABULAR:
            return getPhaseTapChangerTabular();
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT:
            return getPhaseTapChangerTablePoint();
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABULAR:
            getPhaseTapChangerTabular().clear();
            getPhaseTapChangerTabular().addAll( ( Collection< ? extends PhaseTapChangerTabular > ) newValue );
            return;
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT:
            getPhaseTapChangerTablePoint().clear();
            getPhaseTapChangerTablePoint().addAll( ( Collection< ? extends PhaseTapChangerTablePoint > ) newValue );
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABULAR:
            unsetPhaseTapChangerTabular();
            return;
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT:
            unsetPhaseTapChangerTablePoint();
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABULAR:
            return isSetPhaseTapChangerTabular();
        case CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT:
            return isSetPhaseTapChangerTablePoint();
        }
        return super.eIsSet( featureID );
    }

} //PhaseTapChangerTableImpl
