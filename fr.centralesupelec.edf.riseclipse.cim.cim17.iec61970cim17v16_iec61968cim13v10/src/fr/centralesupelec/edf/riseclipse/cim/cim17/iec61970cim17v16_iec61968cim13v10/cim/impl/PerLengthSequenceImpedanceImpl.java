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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthSequenceImpedance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Per Length Sequence Impedance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthSequenceImpedanceImpl#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthSequenceImpedanceImpl#getBch <em>Bch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthSequenceImpedanceImpl#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthSequenceImpedanceImpl#getGch <em>Gch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthSequenceImpedanceImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthSequenceImpedanceImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthSequenceImpedanceImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PerLengthSequenceImpedanceImpl#getX0 <em>X0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerLengthSequenceImpedanceImpl extends PerLengthImpedanceImpl implements PerLengthSequenceImpedance {
    /**
     * The default value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0ch()
     * @generated
     * @ordered
     */
    protected static final Float B0CH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0ch()
     * @generated
     * @ordered
     */
    protected Float b0ch = B0CH_EDEFAULT;

    /**
     * This is true if the B0ch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b0chESet;

    /**
     * The default value of the '{@link #getBch() <em>Bch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBch()
     * @generated
     * @ordered
     */
    protected static final Float BCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBch() <em>Bch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBch()
     * @generated
     * @ordered
     */
    protected Float bch = BCH_EDEFAULT;

    /**
     * This is true if the Bch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bchESet;

    /**
     * The default value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0ch()
     * @generated
     * @ordered
     */
    protected static final Float G0CH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0ch()
     * @generated
     * @ordered
     */
    protected Float g0ch = G0CH_EDEFAULT;

    /**
     * This is true if the G0ch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g0chESet;

    /**
     * The default value of the '{@link #getGch() <em>Gch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGch()
     * @generated
     * @ordered
     */
    protected static final Float GCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGch() <em>Gch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGch()
     * @generated
     * @ordered
     */
    protected Float gch = GCH_EDEFAULT;

    /**
     * This is true if the Gch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gchESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Float R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Float r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Float R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Float r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Float X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Float x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Float X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Float x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PerLengthSequenceImpedanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPerLengthSequenceImpedance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getB0ch() {
        return b0ch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB0ch( Float newB0ch ) {
        Float oldB0ch = b0ch;
        b0ch = newB0ch;
        boolean oldB0chESet = b0chESet;
        b0chESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH, oldB0ch, b0ch, !oldB0chESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB0ch() {
        Float oldB0ch = b0ch;
        boolean oldB0chESet = b0chESet;
        b0ch = B0CH_EDEFAULT;
        b0chESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH, oldB0ch, B0CH_EDEFAULT, oldB0chESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB0ch() {
        return b0chESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBch() {
        return bch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBch( Float newBch ) {
        Float oldBch = bch;
        bch = newBch;
        boolean oldBchESet = bchESet;
        bchESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__BCH, oldBch, bch, !oldBchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBch() {
        Float oldBch = bch;
        boolean oldBchESet = bchESet;
        bch = BCH_EDEFAULT;
        bchESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__BCH, oldBch, BCH_EDEFAULT, oldBchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBch() {
        return bchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG0ch() {
        return g0ch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG0ch( Float newG0ch ) {
        Float oldG0ch = g0ch;
        g0ch = newG0ch;
        boolean oldG0chESet = g0chESet;
        g0chESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH, oldG0ch, g0ch, !oldG0chESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG0ch() {
        Float oldG0ch = g0ch;
        boolean oldG0chESet = g0chESet;
        g0ch = G0CH_EDEFAULT;
        g0chESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH, oldG0ch, G0CH_EDEFAULT, oldG0chESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG0ch() {
        return g0chESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGch() {
        return gch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGch( Float newGch ) {
        Float oldGch = gch;
        gch = newGch;
        boolean oldGchESet = gchESet;
        gchESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__GCH, oldGch, gch, !oldGchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGch() {
        Float oldGch = gch;
        boolean oldGchESet = gchESet;
        gch = GCH_EDEFAULT;
        gchESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__GCH, oldGch, GCH_EDEFAULT, oldGchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGch() {
        return gchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Float newR ) {
        Float oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Float oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R, oldR, R_EDEFAULT, oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Float newR0 ) {
        Float oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R0, oldR0, r0, !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Float oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Float newX ) {
        Float oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Float oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X, oldX, X_EDEFAULT, oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Float newX0 ) {
        Float oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X0, oldX0, x0, !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Float oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH:
            return getB0ch();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__BCH:
            return getBch();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH:
            return getG0ch();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__GCH:
            return getGch();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R:
            return getR();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R0:
            return getR0();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X:
            return getX();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X0:
            return getX0();
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
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH:
            setB0ch( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__BCH:
            setBch( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH:
            setG0ch( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__GCH:
            setGch( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X0:
            setX0( ( Float ) newValue );
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
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH:
            unsetB0ch();
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__BCH:
            unsetBch();
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH:
            unsetG0ch();
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__GCH:
            unsetGch();
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R:
            unsetR();
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R0:
            unsetR0();
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X:
            unsetX();
            return;
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X0:
            unsetX0();
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
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__B0CH:
            return isSetB0ch();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__BCH:
            return isSetBch();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__G0CH:
            return isSetG0ch();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__GCH:
            return isSetGch();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R:
            return isSetR();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__R0:
            return isSetR0();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X:
            return isSetX();
        case CimPackage.PER_LENGTH_SEQUENCE_IMPEDANCE__X0:
            return isSetX0();
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
        result.append( " (b0ch: " );
        if( b0chESet )
            result.append( b0ch );
        else
            result.append( "<unset>" );
        result.append( ", bch: " );
        if( bchESet )
            result.append( bch );
        else
            result.append( "<unset>" );
        result.append( ", g0ch: " );
        if( g0chESet )
            result.append( g0ch );
        else
            result.append( "<unset>" );
        result.append( ", gch: " );
        if( gchESet )
            result.append( gch );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PerLengthSequenceImpedanceImpl
