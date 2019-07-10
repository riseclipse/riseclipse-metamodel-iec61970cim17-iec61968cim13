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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationModeKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationTechniqueKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation;

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
 * An implementation of the model object '<em><b>Statistical Calculation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StatisticalCalculationImpl#getCalculationMode <em>Calculation Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StatisticalCalculationImpl#getCalculationTechnique <em>Calculation Technique</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StatisticalCalculationImpl#getCalculationMethodOrder <em>Calculation Method Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticalCalculationImpl extends IdentifiedObjectImpl implements StatisticalCalculation {
    /**
     * The default value of the '{@link #getCalculationMode() <em>Calculation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationMode()
     * @generated
     * @ordered
     */
    protected static final CalculationModeKind CALCULATION_MODE_EDEFAULT = CalculationModeKind.TOTAL;

    /**
     * The cached value of the '{@link #getCalculationMode() <em>Calculation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationMode()
     * @generated
     * @ordered
     */
    protected CalculationModeKind calculationMode = CALCULATION_MODE_EDEFAULT;

    /**
     * This is true if the Calculation Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean calculationModeESet;

    /**
     * The default value of the '{@link #getCalculationTechnique() <em>Calculation Technique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationTechnique()
     * @generated
     * @ordered
     */
    protected static final CalculationTechniqueKind CALCULATION_TECHNIQUE_EDEFAULT = CalculationTechniqueKind.TRUE_RMS;

    /**
     * The cached value of the '{@link #getCalculationTechnique() <em>Calculation Technique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationTechnique()
     * @generated
     * @ordered
     */
    protected CalculationTechniqueKind calculationTechnique = CALCULATION_TECHNIQUE_EDEFAULT;

    /**
     * This is true if the Calculation Technique attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean calculationTechniqueESet;

    /**
     * The cached value of the '{@link #getCalculationMethodOrder() <em>Calculation Method Order</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationMethodOrder()
     * @generated
     * @ordered
     */
    protected EList< CalculationMethodOrder > calculationMethodOrder;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatisticalCalculationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStatisticalCalculation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CalculationModeKind getCalculationMode() {
        return calculationMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCalculationMode( CalculationModeKind newCalculationMode ) {
        CalculationModeKind oldCalculationMode = calculationMode;
        calculationMode = newCalculationMode == null ? CALCULATION_MODE_EDEFAULT : newCalculationMode;
        boolean oldCalculationModeESet = calculationModeESet;
        calculationModeESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.STATISTICAL_CALCULATION__CALCULATION_MODE,
                        oldCalculationMode, calculationMode, !oldCalculationModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCalculationMode() {
        CalculationModeKind oldCalculationMode = calculationMode;
        boolean oldCalculationModeESet = calculationModeESet;
        calculationMode = CALCULATION_MODE_EDEFAULT;
        calculationModeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.STATISTICAL_CALCULATION__CALCULATION_MODE,
                        oldCalculationMode, CALCULATION_MODE_EDEFAULT, oldCalculationModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationMode() {
        return calculationModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CalculationTechniqueKind getCalculationTechnique() {
        return calculationTechnique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCalculationTechnique( CalculationTechniqueKind newCalculationTechnique ) {
        CalculationTechniqueKind oldCalculationTechnique = calculationTechnique;
        calculationTechnique = newCalculationTechnique == null ? CALCULATION_TECHNIQUE_EDEFAULT
                : newCalculationTechnique;
        boolean oldCalculationTechniqueESet = calculationTechniqueESet;
        calculationTechniqueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STATISTICAL_CALCULATION__CALCULATION_TECHNIQUE, oldCalculationTechnique,
                calculationTechnique, !oldCalculationTechniqueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCalculationTechnique() {
        CalculationTechniqueKind oldCalculationTechnique = calculationTechnique;
        boolean oldCalculationTechniqueESet = calculationTechniqueESet;
        calculationTechnique = CALCULATION_TECHNIQUE_EDEFAULT;
        calculationTechniqueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STATISTICAL_CALCULATION__CALCULATION_TECHNIQUE, oldCalculationTechnique,
                CALCULATION_TECHNIQUE_EDEFAULT, oldCalculationTechniqueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationTechnique() {
        return calculationTechniqueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CalculationMethodOrder > getCalculationMethodOrder() {
        if( calculationMethodOrder == null ) {
            calculationMethodOrder = new EObjectWithInverseResolvingEList.Unsettable< CalculationMethodOrder >(
                    CalculationMethodOrder.class, this, CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER,
                    CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION );
        }
        return calculationMethodOrder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCalculationMethodOrder() {
        if( calculationMethodOrder != null ) ( ( InternalEList.Unsettable< ? > ) calculationMethodOrder ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationMethodOrder() {
        return calculationMethodOrder != null && ( ( InternalEList.Unsettable< ? > ) calculationMethodOrder ).isSet();
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
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCalculationMethodOrder() )
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
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER:
            return ( ( InternalEList< ? > ) getCalculationMethodOrder() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_MODE:
            return getCalculationMode();
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_TECHNIQUE:
            return getCalculationTechnique();
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER:
            return getCalculationMethodOrder();
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
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_MODE:
            setCalculationMode( ( CalculationModeKind ) newValue );
            return;
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_TECHNIQUE:
            setCalculationTechnique( ( CalculationTechniqueKind ) newValue );
            return;
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER:
            getCalculationMethodOrder().clear();
            getCalculationMethodOrder().addAll( ( Collection< ? extends CalculationMethodOrder > ) newValue );
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
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_MODE:
            unsetCalculationMode();
            return;
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_TECHNIQUE:
            unsetCalculationTechnique();
            return;
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER:
            unsetCalculationMethodOrder();
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
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_MODE:
            return isSetCalculationMode();
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_TECHNIQUE:
            return isSetCalculationTechnique();
        case CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER:
            return isSetCalculationMethodOrder();
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
        result.append( " (calculationMode: " );
        if( calculationModeESet )
            result.append( calculationMode );
        else
            result.append( "<unset>" );
        result.append( ", calculationTechnique: " );
        if( calculationTechniqueESet )
            result.append( calculationTechnique );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StatisticalCalculationImpl
