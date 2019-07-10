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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpCostCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Unit Op Cost Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenUnitOpCostCurveImpl#getIsNetGrossP <em>Is Net Gross P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GenUnitOpCostCurveImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenUnitOpCostCurveImpl extends CurveImpl implements GenUnitOpCostCurve {
    /**
     * The default value of the '{@link #getIsNetGrossP() <em>Is Net Gross P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsNetGrossP()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_NET_GROSS_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsNetGrossP() <em>Is Net Gross P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsNetGrossP()
     * @generated
     * @ordered
     */
    protected Boolean isNetGrossP = IS_NET_GROSS_P_EDEFAULT;

    /**
     * This is true if the Is Net Gross P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isNetGrossPESet;

    /**
     * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneratingUnit()
     * @generated
     * @ordered
     */
    protected GeneratingUnit generatingUnit;

    /**
     * This is true if the Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean generatingUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenUnitOpCostCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGenUnitOpCostCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsNetGrossP() {
        return isNetGrossP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsNetGrossP( Boolean newIsNetGrossP ) {
        Boolean oldIsNetGrossP = isNetGrossP;
        isNetGrossP = newIsNetGrossP;
        boolean oldIsNetGrossPESet = isNetGrossPESet;
        isNetGrossPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P, oldIsNetGrossP, isNetGrossP, !oldIsNetGrossPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsNetGrossP() {
        Boolean oldIsNetGrossP = isNetGrossP;
        boolean oldIsNetGrossPESet = isNetGrossPESet;
        isNetGrossP = IS_NET_GROSS_P_EDEFAULT;
        isNetGrossPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P,
                    oldIsNetGrossP, IS_NET_GROSS_P_EDEFAULT, oldIsNetGrossPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsNetGrossP() {
        return isNetGrossPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneratingUnit getGeneratingUnit() {
        return generatingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneratingUnit( GeneratingUnit newGeneratingUnit, NotificationChain msgs ) {
        GeneratingUnit oldGeneratingUnit = generatingUnit;
        generatingUnit = newGeneratingUnit;
        boolean oldGeneratingUnitESet = generatingUnitESet;
        generatingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit,
                    !oldGeneratingUnitESet );
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
    public void setGeneratingUnit( GeneratingUnit newGeneratingUnit ) {
        if( newGeneratingUnit != generatingUnit ) {
            NotificationChain msgs = null;
            if( generatingUnit != null ) msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                    CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES, GeneratingUnit.class, msgs );
            if( newGeneratingUnit != null ) msgs = ( ( InternalEObject ) newGeneratingUnit ).eInverseAdd( this,
                    CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES, GeneratingUnit.class, msgs );
            msgs = basicSetGeneratingUnit( newGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGeneratingUnitESet = generatingUnitESet;
            generatingUnitESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT,
                            newGeneratingUnit, newGeneratingUnit, !oldGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGeneratingUnit( NotificationChain msgs ) {
        GeneratingUnit oldGeneratingUnit = generatingUnit;
        generatingUnit = null;
        boolean oldGeneratingUnitESet = generatingUnitESet;
        generatingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT, oldGeneratingUnit, null,
                    oldGeneratingUnitESet );
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
    public void unsetGeneratingUnit() {
        if( generatingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                    CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES, GeneratingUnit.class, msgs );
            msgs = basicUnsetGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGeneratingUnitESet = generatingUnitESet;
            generatingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT, null, null, oldGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGeneratingUnit() {
        return generatingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
            if( generatingUnit != null ) msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                    CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES, GeneratingUnit.class, msgs );
            return basicSetGeneratingUnit( ( GeneratingUnit ) otherEnd, msgs );
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
        case CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
            return basicUnsetGeneratingUnit( msgs );
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
        case CimPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P:
            return getIsNetGrossP();
        case CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
            return getGeneratingUnit();
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
        case CimPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P:
            setIsNetGrossP( ( Boolean ) newValue );
            return;
        case CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
            setGeneratingUnit( ( GeneratingUnit ) newValue );
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
        case CimPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P:
            unsetIsNetGrossP();
            return;
        case CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
            unsetGeneratingUnit();
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
        case CimPackage.GEN_UNIT_OP_COST_CURVE__IS_NET_GROSS_P:
            return isSetIsNetGrossP();
        case CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT:
            return isSetGeneratingUnit();
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
        result.append( " (isNetGrossP: " );
        if( isNetGrossPESet )
            result.append( isNetGrossP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GenUnitOpCostCurveImpl
