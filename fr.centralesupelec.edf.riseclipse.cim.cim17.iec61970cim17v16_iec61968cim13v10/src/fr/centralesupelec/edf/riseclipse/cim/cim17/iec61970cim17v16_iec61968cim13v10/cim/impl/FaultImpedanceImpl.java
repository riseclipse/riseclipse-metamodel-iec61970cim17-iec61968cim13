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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FaultImpedance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Impedance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpedanceImpl#getRGround <em>RGround</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpedanceImpl#getRLineToLine <em>RLine To Line</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpedanceImpl#getXGround <em>XGround</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FaultImpedanceImpl#getXLineToLine <em>XLine To Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultImpedanceImpl extends MinimalEObjectImpl.Container implements FaultImpedance {
    /**
     * The default value of the '{@link #getRGround() <em>RGround</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRGround()
     * @generated
     * @ordered
     */
    protected static final Float RGROUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRGround() <em>RGround</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRGround()
     * @generated
     * @ordered
     */
    protected Float rGround = RGROUND_EDEFAULT;

    /**
     * This is true if the RGround attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rGroundESet;

    /**
     * The default value of the '{@link #getRLineToLine() <em>RLine To Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRLineToLine()
     * @generated
     * @ordered
     */
    protected static final Float RLINE_TO_LINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRLineToLine() <em>RLine To Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRLineToLine()
     * @generated
     * @ordered
     */
    protected Float rLineToLine = RLINE_TO_LINE_EDEFAULT;

    /**
     * This is true if the RLine To Line attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rLineToLineESet;

    /**
     * The default value of the '{@link #getXGround() <em>XGround</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXGround()
     * @generated
     * @ordered
     */
    protected static final Float XGROUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXGround() <em>XGround</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXGround()
     * @generated
     * @ordered
     */
    protected Float xGround = XGROUND_EDEFAULT;

    /**
     * This is true if the XGround attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xGroundESet;

    /**
     * The default value of the '{@link #getXLineToLine() <em>XLine To Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXLineToLine()
     * @generated
     * @ordered
     */
    protected static final Float XLINE_TO_LINE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXLineToLine() <em>XLine To Line</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXLineToLine()
     * @generated
     * @ordered
     */
    protected Float xLineToLine = XLINE_TO_LINE_EDEFAULT;

    /**
     * This is true if the XLine To Line attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xLineToLineESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FaultImpedanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFaultImpedance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRGround() {
        return rGround;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRGround( Float newRGround ) {
        Float oldRGround = rGround;
        rGround = newRGround;
        boolean oldRGroundESet = rGroundESet;
        rGroundESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FAULT_IMPEDANCE__RGROUND, oldRGround, rGround, !oldRGroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRGround() {
        Float oldRGround = rGround;
        boolean oldRGroundESet = rGroundESet;
        rGround = RGROUND_EDEFAULT;
        rGroundESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FAULT_IMPEDANCE__RGROUND, oldRGround, RGROUND_EDEFAULT, oldRGroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRGround() {
        return rGroundESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRLineToLine() {
        return rLineToLine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRLineToLine( Float newRLineToLine ) {
        Float oldRLineToLine = rLineToLine;
        rLineToLine = newRLineToLine;
        boolean oldRLineToLineESet = rLineToLineESet;
        rLineToLineESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FAULT_IMPEDANCE__RLINE_TO_LINE, oldRLineToLine, rLineToLine, !oldRLineToLineESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRLineToLine() {
        Float oldRLineToLine = rLineToLine;
        boolean oldRLineToLineESet = rLineToLineESet;
        rLineToLine = RLINE_TO_LINE_EDEFAULT;
        rLineToLineESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FAULT_IMPEDANCE__RLINE_TO_LINE,
                    oldRLineToLine, RLINE_TO_LINE_EDEFAULT, oldRLineToLineESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRLineToLine() {
        return rLineToLineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXGround() {
        return xGround;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXGround( Float newXGround ) {
        Float oldXGround = xGround;
        xGround = newXGround;
        boolean oldXGroundESet = xGroundESet;
        xGroundESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FAULT_IMPEDANCE__XGROUND, oldXGround, xGround, !oldXGroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXGround() {
        Float oldXGround = xGround;
        boolean oldXGroundESet = xGroundESet;
        xGround = XGROUND_EDEFAULT;
        xGroundESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FAULT_IMPEDANCE__XGROUND, oldXGround, XGROUND_EDEFAULT, oldXGroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXGround() {
        return xGroundESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXLineToLine() {
        return xLineToLine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXLineToLine( Float newXLineToLine ) {
        Float oldXLineToLine = xLineToLine;
        xLineToLine = newXLineToLine;
        boolean oldXLineToLineESet = xLineToLineESet;
        xLineToLineESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FAULT_IMPEDANCE__XLINE_TO_LINE, oldXLineToLine, xLineToLine, !oldXLineToLineESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXLineToLine() {
        Float oldXLineToLine = xLineToLine;
        boolean oldXLineToLineESet = xLineToLineESet;
        xLineToLine = XLINE_TO_LINE_EDEFAULT;
        xLineToLineESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FAULT_IMPEDANCE__XLINE_TO_LINE,
                    oldXLineToLine, XLINE_TO_LINE_EDEFAULT, oldXLineToLineESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXLineToLine() {
        return xLineToLineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.FAULT_IMPEDANCE__RGROUND:
            return getRGround();
        case CimPackage.FAULT_IMPEDANCE__RLINE_TO_LINE:
            return getRLineToLine();
        case CimPackage.FAULT_IMPEDANCE__XGROUND:
            return getXGround();
        case CimPackage.FAULT_IMPEDANCE__XLINE_TO_LINE:
            return getXLineToLine();
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
        case CimPackage.FAULT_IMPEDANCE__RGROUND:
            setRGround( ( Float ) newValue );
            return;
        case CimPackage.FAULT_IMPEDANCE__RLINE_TO_LINE:
            setRLineToLine( ( Float ) newValue );
            return;
        case CimPackage.FAULT_IMPEDANCE__XGROUND:
            setXGround( ( Float ) newValue );
            return;
        case CimPackage.FAULT_IMPEDANCE__XLINE_TO_LINE:
            setXLineToLine( ( Float ) newValue );
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
        case CimPackage.FAULT_IMPEDANCE__RGROUND:
            unsetRGround();
            return;
        case CimPackage.FAULT_IMPEDANCE__RLINE_TO_LINE:
            unsetRLineToLine();
            return;
        case CimPackage.FAULT_IMPEDANCE__XGROUND:
            unsetXGround();
            return;
        case CimPackage.FAULT_IMPEDANCE__XLINE_TO_LINE:
            unsetXLineToLine();
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
        case CimPackage.FAULT_IMPEDANCE__RGROUND:
            return isSetRGround();
        case CimPackage.FAULT_IMPEDANCE__RLINE_TO_LINE:
            return isSetRLineToLine();
        case CimPackage.FAULT_IMPEDANCE__XGROUND:
            return isSetXGround();
        case CimPackage.FAULT_IMPEDANCE__XLINE_TO_LINE:
            return isSetXLineToLine();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (rGround: " );
        if( rGroundESet )
            result.append( rGround );
        else
            result.append( "<unset>" );
        result.append( ", rLineToLine: " );
        if( rLineToLineESet )
            result.append( rLineToLine );
        else
            result.append( "<unset>" );
        result.append( ", xGround: " );
        if( xGroundESet )
            result.append( xGround );
        else
            result.append( "<unset>" );
        result.append( ", xLineToLine: " );
        if( xLineToLineESet )
            result.append( xLineToLine );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FaultImpedanceImpl
