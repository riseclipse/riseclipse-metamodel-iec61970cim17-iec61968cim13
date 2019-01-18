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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Tool;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ToolImpl#getLastCalibrationDate <em>Last Calibration Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToolImpl extends WorkAssetImpl implements Tool {
    /**
     * The default value of the '{@link #getLastCalibrationDate() <em>Last Calibration Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastCalibrationDate()
     * @generated
     * @ordered
     */
    protected static final Date LAST_CALIBRATION_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastCalibrationDate() <em>Last Calibration Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastCalibrationDate()
     * @generated
     * @ordered
     */
    protected Date lastCalibrationDate = LAST_CALIBRATION_DATE_EDEFAULT;

    /**
     * This is true if the Last Calibration Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lastCalibrationDateESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ToolImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTool();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getLastCalibrationDate() {
        return lastCalibrationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLastCalibrationDate( Date newLastCalibrationDate ) {
        Date oldLastCalibrationDate = lastCalibrationDate;
        lastCalibrationDate = newLastCalibrationDate;
        boolean oldLastCalibrationDateESet = lastCalibrationDateESet;
        lastCalibrationDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOOL__LAST_CALIBRATION_DATE,
                    oldLastCalibrationDate, lastCalibrationDate, !oldLastCalibrationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLastCalibrationDate() {
        Date oldLastCalibrationDate = lastCalibrationDate;
        boolean oldLastCalibrationDateESet = lastCalibrationDateESet;
        lastCalibrationDate = LAST_CALIBRATION_DATE_EDEFAULT;
        lastCalibrationDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TOOL__LAST_CALIBRATION_DATE,
                    oldLastCalibrationDate, LAST_CALIBRATION_DATE_EDEFAULT, oldLastCalibrationDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLastCalibrationDate() {
        return lastCalibrationDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TOOL__LAST_CALIBRATION_DATE:
            return getLastCalibrationDate();
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
        case CimPackage.TOOL__LAST_CALIBRATION_DATE:
            setLastCalibrationDate( ( Date ) newValue );
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
        case CimPackage.TOOL__LAST_CALIBRATION_DATE:
            unsetLastCalibrationDate();
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
        case CimPackage.TOOL__LAST_CALIBRATION_DATE:
            return isSetLastCalibrationDate();
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
        result.append( " (lastCalibrationDate: " );
        if( lastCalibrationDateESet )
            result.append( lastCalibrationDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ToolImpl
