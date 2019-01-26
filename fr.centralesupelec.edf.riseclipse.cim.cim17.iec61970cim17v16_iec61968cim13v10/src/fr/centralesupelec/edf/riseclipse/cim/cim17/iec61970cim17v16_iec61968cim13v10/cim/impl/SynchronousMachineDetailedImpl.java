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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IfdBaseKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineDetailed;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Machine Detailed</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDetailedImpl#getEfdBaseRatio <em>Efd Base Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDetailedImpl#getIfdBaseType <em>Ifd Base Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDetailedImpl#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineDetailedImpl#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousMachineDetailedImpl extends SynchronousMachineDynamicsImpl
        implements SynchronousMachineDetailed {
    /**
     * The default value of the '{@link #getEfdBaseRatio() <em>Efd Base Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdBaseRatio()
     * @generated
     * @ordered
     */
    protected static final Float EFD_BASE_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfdBaseRatio() <em>Efd Base Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdBaseRatio()
     * @generated
     * @ordered
     */
    protected Float efdBaseRatio = EFD_BASE_RATIO_EDEFAULT;

    /**
     * This is true if the Efd Base Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efdBaseRatioESet;

    /**
     * The default value of the '{@link #getIfdBaseType() <em>Ifd Base Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdBaseType()
     * @generated
     * @ordered
     */
    protected static final IfdBaseKind IFD_BASE_TYPE_EDEFAULT = IfdBaseKind.IFAG;

    /**
     * The cached value of the '{@link #getIfdBaseType() <em>Ifd Base Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdBaseType()
     * @generated
     * @ordered
     */
    protected IfdBaseKind ifdBaseType = IFD_BASE_TYPE_EDEFAULT;

    /**
     * This is true if the Ifd Base Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ifdBaseTypeESet;

    /**
     * The default value of the '{@link #getSaturationFactor120QAxis() <em>Saturation Factor120 QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSaturationFactor120QAxis()
     * @generated
     * @ordered
     */
    protected static final Float SATURATION_FACTOR120_QAXIS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSaturationFactor120QAxis() <em>Saturation Factor120 QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSaturationFactor120QAxis()
     * @generated
     * @ordered
     */
    protected Float saturationFactor120QAxis = SATURATION_FACTOR120_QAXIS_EDEFAULT;

    /**
     * This is true if the Saturation Factor120 QAxis attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean saturationFactor120QAxisESet;

    /**
     * The default value of the '{@link #getSaturationFactorQAxis() <em>Saturation Factor QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSaturationFactorQAxis()
     * @generated
     * @ordered
     */
    protected static final Float SATURATION_FACTOR_QAXIS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSaturationFactorQAxis() <em>Saturation Factor QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSaturationFactorQAxis()
     * @generated
     * @ordered
     */
    protected Float saturationFactorQAxis = SATURATION_FACTOR_QAXIS_EDEFAULT;

    /**
     * This is true if the Saturation Factor QAxis attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean saturationFactorQAxisESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronousMachineDetailedImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSynchronousMachineDetailed();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfdBaseRatio() {
        return efdBaseRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfdBaseRatio( Float newEfdBaseRatio ) {
        Float oldEfdBaseRatio = efdBaseRatio;
        efdBaseRatio = newEfdBaseRatio;
        boolean oldEfdBaseRatioESet = efdBaseRatioESet;
        efdBaseRatioESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE_DETAILED__EFD_BASE_RATIO,
                        oldEfdBaseRatio, efdBaseRatio, !oldEfdBaseRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfdBaseRatio() {
        Float oldEfdBaseRatio = efdBaseRatio;
        boolean oldEfdBaseRatioESet = efdBaseRatioESet;
        efdBaseRatio = EFD_BASE_RATIO_EDEFAULT;
        efdBaseRatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_DETAILED__EFD_BASE_RATIO, oldEfdBaseRatio, EFD_BASE_RATIO_EDEFAULT,
                oldEfdBaseRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfdBaseRatio() {
        return efdBaseRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public IfdBaseKind getIfdBaseType() {
        return ifdBaseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIfdBaseType( IfdBaseKind newIfdBaseType ) {
        IfdBaseKind oldIfdBaseType = ifdBaseType;
        ifdBaseType = newIfdBaseType == null ? IFD_BASE_TYPE_EDEFAULT : newIfdBaseType;
        boolean oldIfdBaseTypeESet = ifdBaseTypeESet;
        ifdBaseTypeESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SYNCHRONOUS_MACHINE_DETAILED__IFD_BASE_TYPE,
                        oldIfdBaseType, ifdBaseType, !oldIfdBaseTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIfdBaseType() {
        IfdBaseKind oldIfdBaseType = ifdBaseType;
        boolean oldIfdBaseTypeESet = ifdBaseTypeESet;
        ifdBaseType = IFD_BASE_TYPE_EDEFAULT;
        ifdBaseTypeESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHRONOUS_MACHINE_DETAILED__IFD_BASE_TYPE,
                        oldIfdBaseType, IFD_BASE_TYPE_EDEFAULT, oldIfdBaseTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIfdBaseType() {
        return ifdBaseTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSaturationFactor120QAxis() {
        return saturationFactor120QAxis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSaturationFactor120QAxis( Float newSaturationFactor120QAxis ) {
        Float oldSaturationFactor120QAxis = saturationFactor120QAxis;
        saturationFactor120QAxis = newSaturationFactor120QAxis;
        boolean oldSaturationFactor120QAxisESet = saturationFactor120QAxisESet;
        saturationFactor120QAxisESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR120_QAXIS, oldSaturationFactor120QAxis,
                saturationFactor120QAxis, !oldSaturationFactor120QAxisESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSaturationFactor120QAxis() {
        Float oldSaturationFactor120QAxis = saturationFactor120QAxis;
        boolean oldSaturationFactor120QAxisESet = saturationFactor120QAxisESet;
        saturationFactor120QAxis = SATURATION_FACTOR120_QAXIS_EDEFAULT;
        saturationFactor120QAxisESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR120_QAXIS, oldSaturationFactor120QAxis,
                SATURATION_FACTOR120_QAXIS_EDEFAULT, oldSaturationFactor120QAxisESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSaturationFactor120QAxis() {
        return saturationFactor120QAxisESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSaturationFactorQAxis() {
        return saturationFactorQAxis;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSaturationFactorQAxis( Float newSaturationFactorQAxis ) {
        Float oldSaturationFactorQAxis = saturationFactorQAxis;
        saturationFactorQAxis = newSaturationFactorQAxis;
        boolean oldSaturationFactorQAxisESet = saturationFactorQAxisESet;
        saturationFactorQAxisESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR_QAXIS, oldSaturationFactorQAxis,
                saturationFactorQAxis, !oldSaturationFactorQAxisESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSaturationFactorQAxis() {
        Float oldSaturationFactorQAxis = saturationFactorQAxis;
        boolean oldSaturationFactorQAxisESet = saturationFactorQAxisESet;
        saturationFactorQAxis = SATURATION_FACTOR_QAXIS_EDEFAULT;
        saturationFactorQAxisESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR_QAXIS, oldSaturationFactorQAxis,
                SATURATION_FACTOR_QAXIS_EDEFAULT, oldSaturationFactorQAxisESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSaturationFactorQAxis() {
        return saturationFactorQAxisESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__EFD_BASE_RATIO:
            return getEfdBaseRatio();
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__IFD_BASE_TYPE:
            return getIfdBaseType();
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR120_QAXIS:
            return getSaturationFactor120QAxis();
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR_QAXIS:
            return getSaturationFactorQAxis();
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
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__EFD_BASE_RATIO:
            setEfdBaseRatio( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__IFD_BASE_TYPE:
            setIfdBaseType( ( IfdBaseKind ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR120_QAXIS:
            setSaturationFactor120QAxis( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR_QAXIS:
            setSaturationFactorQAxis( ( Float ) newValue );
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
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__EFD_BASE_RATIO:
            unsetEfdBaseRatio();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__IFD_BASE_TYPE:
            unsetIfdBaseType();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR120_QAXIS:
            unsetSaturationFactor120QAxis();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR_QAXIS:
            unsetSaturationFactorQAxis();
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
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__EFD_BASE_RATIO:
            return isSetEfdBaseRatio();
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__IFD_BASE_TYPE:
            return isSetIfdBaseType();
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR120_QAXIS:
            return isSetSaturationFactor120QAxis();
        case CimPackage.SYNCHRONOUS_MACHINE_DETAILED__SATURATION_FACTOR_QAXIS:
            return isSetSaturationFactorQAxis();
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
        result.append( " (efdBaseRatio: " );
        if( efdBaseRatioESet )
            result.append( efdBaseRatio );
        else
            result.append( "<unset>" );
        result.append( ", ifdBaseType: " );
        if( ifdBaseTypeESet )
            result.append( ifdBaseType );
        else
            result.append( "<unset>" );
        result.append( ", saturationFactor120QAxis: " );
        if( saturationFactor120QAxisESet )
            result.append( saturationFactor120QAxis );
        else
            result.append( "<unset>" );
        result.append( ", saturationFactorQAxis: " );
        if( saturationFactorQAxisESet )
            result.append( saturationFactorQAxis );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SynchronousMachineDetailedImpl
