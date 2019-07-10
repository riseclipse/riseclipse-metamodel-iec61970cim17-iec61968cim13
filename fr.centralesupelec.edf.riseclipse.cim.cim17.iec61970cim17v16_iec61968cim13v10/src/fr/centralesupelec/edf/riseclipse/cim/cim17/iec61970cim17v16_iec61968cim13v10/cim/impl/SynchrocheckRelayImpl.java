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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchrocheckRelay;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchrocheck Relay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchrocheckRelayImpl#getMaxAngleDiff <em>Max Angle Diff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchrocheckRelayImpl#getMaxFreqDiff <em>Max Freq Diff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchrocheckRelayImpl#getMaxVoltDiff <em>Max Volt Diff</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchrocheckRelayImpl extends ProtectionEquipmentImpl implements SynchrocheckRelay {
    /**
     * The default value of the '{@link #getMaxAngleDiff() <em>Max Angle Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAngleDiff()
     * @generated
     * @ordered
     */
    protected static final Float MAX_ANGLE_DIFF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxAngleDiff() <em>Max Angle Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAngleDiff()
     * @generated
     * @ordered
     */
    protected Float maxAngleDiff = MAX_ANGLE_DIFF_EDEFAULT;

    /**
     * This is true if the Max Angle Diff attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxAngleDiffESet;

    /**
     * The default value of the '{@link #getMaxFreqDiff() <em>Max Freq Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxFreqDiff()
     * @generated
     * @ordered
     */
    protected static final Float MAX_FREQ_DIFF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxFreqDiff() <em>Max Freq Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxFreqDiff()
     * @generated
     * @ordered
     */
    protected Float maxFreqDiff = MAX_FREQ_DIFF_EDEFAULT;

    /**
     * This is true if the Max Freq Diff attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxFreqDiffESet;

    /**
     * The default value of the '{@link #getMaxVoltDiff() <em>Max Volt Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxVoltDiff()
     * @generated
     * @ordered
     */
    protected static final Float MAX_VOLT_DIFF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxVoltDiff() <em>Max Volt Diff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxVoltDiff()
     * @generated
     * @ordered
     */
    protected Float maxVoltDiff = MAX_VOLT_DIFF_EDEFAULT;

    /**
     * This is true if the Max Volt Diff attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxVoltDiffESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchrocheckRelayImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSynchrocheckRelay();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxAngleDiff() {
        return maxAngleDiff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxAngleDiff( Float newMaxAngleDiff ) {
        Float oldMaxAngleDiff = maxAngleDiff;
        maxAngleDiff = newMaxAngleDiff;
        boolean oldMaxAngleDiffESet = maxAngleDiffESet;
        maxAngleDiffESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF, oldMaxAngleDiff, maxAngleDiff, !oldMaxAngleDiffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxAngleDiff() {
        Float oldMaxAngleDiff = maxAngleDiff;
        boolean oldMaxAngleDiffESet = maxAngleDiffESet;
        maxAngleDiff = MAX_ANGLE_DIFF_EDEFAULT;
        maxAngleDiffESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF,
                    oldMaxAngleDiff, MAX_ANGLE_DIFF_EDEFAULT, oldMaxAngleDiffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxAngleDiff() {
        return maxAngleDiffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxFreqDiff() {
        return maxFreqDiff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxFreqDiff( Float newMaxFreqDiff ) {
        Float oldMaxFreqDiff = maxFreqDiff;
        maxFreqDiff = newMaxFreqDiff;
        boolean oldMaxFreqDiffESet = maxFreqDiffESet;
        maxFreqDiffESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF, oldMaxFreqDiff, maxFreqDiff, !oldMaxFreqDiffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxFreqDiff() {
        Float oldMaxFreqDiff = maxFreqDiff;
        boolean oldMaxFreqDiffESet = maxFreqDiffESet;
        maxFreqDiff = MAX_FREQ_DIFF_EDEFAULT;
        maxFreqDiffESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF,
                    oldMaxFreqDiff, MAX_FREQ_DIFF_EDEFAULT, oldMaxFreqDiffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxFreqDiff() {
        return maxFreqDiffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxVoltDiff() {
        return maxVoltDiff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxVoltDiff( Float newMaxVoltDiff ) {
        Float oldMaxVoltDiff = maxVoltDiff;
        maxVoltDiff = newMaxVoltDiff;
        boolean oldMaxVoltDiffESet = maxVoltDiffESet;
        maxVoltDiffESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF, oldMaxVoltDiff, maxVoltDiff, !oldMaxVoltDiffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxVoltDiff() {
        Float oldMaxVoltDiff = maxVoltDiff;
        boolean oldMaxVoltDiffESet = maxVoltDiffESet;
        maxVoltDiff = MAX_VOLT_DIFF_EDEFAULT;
        maxVoltDiffESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF,
                    oldMaxVoltDiff, MAX_VOLT_DIFF_EDEFAULT, oldMaxVoltDiffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxVoltDiff() {
        return maxVoltDiffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
            return getMaxAngleDiff();
        case CimPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
            return getMaxFreqDiff();
        case CimPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
            return getMaxVoltDiff();
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
        case CimPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
            setMaxAngleDiff( ( Float ) newValue );
            return;
        case CimPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
            setMaxFreqDiff( ( Float ) newValue );
            return;
        case CimPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
            setMaxVoltDiff( ( Float ) newValue );
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
        case CimPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
            unsetMaxAngleDiff();
            return;
        case CimPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
            unsetMaxFreqDiff();
            return;
        case CimPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
            unsetMaxVoltDiff();
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
        case CimPackage.SYNCHROCHECK_RELAY__MAX_ANGLE_DIFF:
            return isSetMaxAngleDiff();
        case CimPackage.SYNCHROCHECK_RELAY__MAX_FREQ_DIFF:
            return isSetMaxFreqDiff();
        case CimPackage.SYNCHROCHECK_RELAY__MAX_VOLT_DIFF:
            return isSetMaxVoltDiff();
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
        result.append( " (maxAngleDiff: " );
        if( maxAngleDiffESet )
            result.append( maxAngleDiff );
        else
            result.append( "<unset>" );
        result.append( ", maxFreqDiff: " );
        if( maxFreqDiffESet )
            result.append( maxFreqDiff );
        else
            result.append( "<unset>" );
        result.append( ", maxVoltDiff: " );
        if( maxVoltDiffESet )
            result.append( maxVoltDiff );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SynchrocheckRelayImpl
