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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Clamp;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Cut;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LineFault;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthImpedance;

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
 * An implementation of the model object '<em><b>AC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getBch <em>Bch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getGch <em>Gch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getShortCircuitEndTemperature <em>Short Circuit End Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getLineFaults <em>Line Faults</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getClamp <em>Clamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getPerLengthImpedance <em>Per Length Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getLineGroundingAction <em>Line Grounding Action</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getCut <em>Cut</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ACLineSegmentImpl#getLineJumpingAction <em>Line Jumping Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACLineSegmentImpl extends ConductorImpl implements ACLineSegment {
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
     * The default value of the '{@link #getShortCircuitEndTemperature() <em>Short Circuit End Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortCircuitEndTemperature()
     * @generated
     * @ordered
     */
    protected static final Float SHORT_CIRCUIT_END_TEMPERATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortCircuitEndTemperature() <em>Short Circuit End Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortCircuitEndTemperature()
     * @generated
     * @ordered
     */
    protected Float shortCircuitEndTemperature = SHORT_CIRCUIT_END_TEMPERATURE_EDEFAULT;

    /**
     * This is true if the Short Circuit End Temperature attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shortCircuitEndTemperatureESet;

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
     * The cached value of the '{@link #getLineFaults() <em>Line Faults</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineFaults()
     * @generated
     * @ordered
     */
    protected EList< LineFault > lineFaults;

    /**
     * The cached value of the '{@link #getClamp() <em>Clamp</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClamp()
     * @generated
     * @ordered
     */
    protected EList< Clamp > clamp;

    /**
     * The cached value of the '{@link #getPerLengthImpedance() <em>Per Length Impedance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPerLengthImpedance()
     * @generated
     * @ordered
     */
    protected PerLengthImpedance perLengthImpedance;

    /**
     * This is true if the Per Length Impedance reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean perLengthImpedanceESet;

    /**
     * The cached value of the '{@link #getLineGroundingAction() <em>Line Grounding Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineGroundingAction()
     * @generated
     * @ordered
     */
    protected GroundAction lineGroundingAction;

    /**
     * This is true if the Line Grounding Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineGroundingActionESet;

    /**
     * The cached value of the '{@link #getCut() <em>Cut</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCut()
     * @generated
     * @ordered
     */
    protected EList< Cut > cut;

    /**
     * The cached value of the '{@link #getLineJumpingAction() <em>Line Jumping Action</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineJumpingAction()
     * @generated
     * @ordered
     */
    protected JumperAction lineJumpingAction;

    /**
     * This is true if the Line Jumping Action reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineJumpingActionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ACLineSegmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getACLineSegment();
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
                CimPackage.AC_LINE_SEGMENT__B0CH, oldB0ch, b0ch, !oldB0chESet ) );
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
                CimPackage.AC_LINE_SEGMENT__B0CH, oldB0ch, B0CH_EDEFAULT, oldB0chESet ) );
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
                CimPackage.AC_LINE_SEGMENT__BCH, oldBch, bch, !oldBchESet ) );
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
                CimPackage.AC_LINE_SEGMENT__BCH, oldBch, BCH_EDEFAULT, oldBchESet ) );
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
                CimPackage.AC_LINE_SEGMENT__G0CH, oldG0ch, g0ch, !oldG0chESet ) );
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
                CimPackage.AC_LINE_SEGMENT__G0CH, oldG0ch, G0CH_EDEFAULT, oldG0chESet ) );
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
                CimPackage.AC_LINE_SEGMENT__GCH, oldGch, gch, !oldGchESet ) );
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
                CimPackage.AC_LINE_SEGMENT__GCH, oldGch, GCH_EDEFAULT, oldGchESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__R, oldR, r, !oldRESet ) );
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
                CimPackage.AC_LINE_SEGMENT__R, oldR, R_EDEFAULT, oldRESet ) );
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
                CimPackage.AC_LINE_SEGMENT__R0, oldR0, r0, !oldR0ESet ) );
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
                CimPackage.AC_LINE_SEGMENT__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
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
    public Float getShortCircuitEndTemperature() {
        return shortCircuitEndTemperature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortCircuitEndTemperature( Float newShortCircuitEndTemperature ) {
        Float oldShortCircuitEndTemperature = shortCircuitEndTemperature;
        shortCircuitEndTemperature = newShortCircuitEndTemperature;
        boolean oldShortCircuitEndTemperatureESet = shortCircuitEndTemperatureESet;
        shortCircuitEndTemperatureESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE, oldShortCircuitEndTemperature,
                shortCircuitEndTemperature, !oldShortCircuitEndTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShortCircuitEndTemperature() {
        Float oldShortCircuitEndTemperature = shortCircuitEndTemperature;
        boolean oldShortCircuitEndTemperatureESet = shortCircuitEndTemperatureESet;
        shortCircuitEndTemperature = SHORT_CIRCUIT_END_TEMPERATURE_EDEFAULT;
        shortCircuitEndTemperatureESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE, oldShortCircuitEndTemperature,
                SHORT_CIRCUIT_END_TEMPERATURE_EDEFAULT, oldShortCircuitEndTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShortCircuitEndTemperature() {
        return shortCircuitEndTemperatureESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__X, oldX, x, !oldXESet ) );
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
                CimPackage.AC_LINE_SEGMENT__X, oldX, X_EDEFAULT, oldXESet ) );
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
                CimPackage.AC_LINE_SEGMENT__X0, oldX0, x0, !oldX0ESet ) );
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
                CimPackage.AC_LINE_SEGMENT__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
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
    public EList< LineFault > getLineFaults() {
        if( lineFaults == null ) {
            lineFaults = new EObjectWithInverseResolvingEList.Unsettable< LineFault >( LineFault.class, this,
                    CimPackage.AC_LINE_SEGMENT__LINE_FAULTS, CimPackage.LINE_FAULT__AC_LINE_SEGMENT );
        }
        return lineFaults;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLineFaults() {
        if( lineFaults != null ) ( ( InternalEList.Unsettable< ? > ) lineFaults ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLineFaults() {
        return lineFaults != null && ( ( InternalEList.Unsettable< ? > ) lineFaults ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Clamp > getClamp() {
        if( clamp == null ) {
            clamp = new EObjectWithInverseResolvingEList.Unsettable< Clamp >( Clamp.class, this,
                    CimPackage.AC_LINE_SEGMENT__CLAMP, CimPackage.CLAMP__AC_LINE_SEGMENT );
        }
        return clamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetClamp() {
        if( clamp != null ) ( ( InternalEList.Unsettable< ? > ) clamp ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClamp() {
        return clamp != null && ( ( InternalEList.Unsettable< ? > ) clamp ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PerLengthImpedance getPerLengthImpedance() {
        return perLengthImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPerLengthImpedance( PerLengthImpedance newPerLengthImpedance,
            NotificationChain msgs ) {
        PerLengthImpedance oldPerLengthImpedance = perLengthImpedance;
        perLengthImpedance = newPerLengthImpedance;
        boolean oldPerLengthImpedanceESet = perLengthImpedanceESet;
        perLengthImpedanceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE, oldPerLengthImpedance, newPerLengthImpedance,
                    !oldPerLengthImpedanceESet );
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
    public void setPerLengthImpedance( PerLengthImpedance newPerLengthImpedance ) {
        if( newPerLengthImpedance != perLengthImpedance ) {
            NotificationChain msgs = null;
            if( perLengthImpedance != null ) msgs = ( ( InternalEObject ) perLengthImpedance ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_IMPEDANCE__AC_LINE_SEGMENTS, PerLengthImpedance.class, msgs );
            if( newPerLengthImpedance != null ) msgs = ( ( InternalEObject ) newPerLengthImpedance ).eInverseAdd( this,
                    CimPackage.PER_LENGTH_IMPEDANCE__AC_LINE_SEGMENTS, PerLengthImpedance.class, msgs );
            msgs = basicSetPerLengthImpedance( newPerLengthImpedance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPerLengthImpedanceESet = perLengthImpedanceESet;
            perLengthImpedanceESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE,
                            newPerLengthImpedance, newPerLengthImpedance, !oldPerLengthImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPerLengthImpedance( NotificationChain msgs ) {
        PerLengthImpedance oldPerLengthImpedance = perLengthImpedance;
        perLengthImpedance = null;
        boolean oldPerLengthImpedanceESet = perLengthImpedanceESet;
        perLengthImpedanceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE, oldPerLengthImpedance, null,
                    oldPerLengthImpedanceESet );
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
    public void unsetPerLengthImpedance() {
        if( perLengthImpedance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) perLengthImpedance ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_IMPEDANCE__AC_LINE_SEGMENTS, PerLengthImpedance.class, msgs );
            msgs = basicUnsetPerLengthImpedance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPerLengthImpedanceESet = perLengthImpedanceESet;
            perLengthImpedanceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE, null, null, oldPerLengthImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPerLengthImpedance() {
        return perLengthImpedanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GroundAction getLineGroundingAction() {
        return lineGroundingAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLineGroundingAction( GroundAction newLineGroundingAction,
            NotificationChain msgs ) {
        GroundAction oldLineGroundingAction = lineGroundingAction;
        lineGroundingAction = newLineGroundingAction;
        boolean oldLineGroundingActionESet = lineGroundingActionESet;
        lineGroundingActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION, oldLineGroundingAction, newLineGroundingAction,
                    !oldLineGroundingActionESet );
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
    public void setLineGroundingAction( GroundAction newLineGroundingAction ) {
        if( newLineGroundingAction != lineGroundingAction ) {
            NotificationChain msgs = null;
            if( lineGroundingAction != null ) msgs = ( ( InternalEObject ) lineGroundingAction ).eInverseRemove( this,
                    CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT, GroundAction.class, msgs );
            if( newLineGroundingAction != null ) msgs = ( ( InternalEObject ) newLineGroundingAction )
                    .eInverseAdd( this, CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT, GroundAction.class, msgs );
            msgs = basicSetLineGroundingAction( newLineGroundingAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLineGroundingActionESet = lineGroundingActionESet;
            lineGroundingActionESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION,
                            newLineGroundingAction, newLineGroundingAction, !oldLineGroundingActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLineGroundingAction( NotificationChain msgs ) {
        GroundAction oldLineGroundingAction = lineGroundingAction;
        lineGroundingAction = null;
        boolean oldLineGroundingActionESet = lineGroundingActionESet;
        lineGroundingActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION, oldLineGroundingAction, null,
                    oldLineGroundingActionESet );
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
    public void unsetLineGroundingAction() {
        if( lineGroundingAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) lineGroundingAction ).eInverseRemove( this,
                    CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT, GroundAction.class, msgs );
            msgs = basicUnsetLineGroundingAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLineGroundingActionESet = lineGroundingActionESet;
            lineGroundingActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION, null, null, oldLineGroundingActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLineGroundingAction() {
        return lineGroundingActionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Cut > getCut() {
        if( cut == null ) {
            cut = new EObjectWithInverseResolvingEList.Unsettable< Cut >( Cut.class, this,
                    CimPackage.AC_LINE_SEGMENT__CUT, CimPackage.CUT__AC_LINE_SEGMENT );
        }
        return cut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCut() {
        if( cut != null ) ( ( InternalEList.Unsettable< ? > ) cut ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCut() {
        return cut != null && ( ( InternalEList.Unsettable< ? > ) cut ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public JumperAction getLineJumpingAction() {
        return lineJumpingAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLineJumpingAction( JumperAction newLineJumpingAction, NotificationChain msgs ) {
        JumperAction oldLineJumpingAction = lineJumpingAction;
        lineJumpingAction = newLineJumpingAction;
        boolean oldLineJumpingActionESet = lineJumpingActionESet;
        lineJumpingActionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION, oldLineJumpingAction, newLineJumpingAction,
                    !oldLineJumpingActionESet );
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
    public void setLineJumpingAction( JumperAction newLineJumpingAction ) {
        if( newLineJumpingAction != lineJumpingAction ) {
            NotificationChain msgs = null;
            if( lineJumpingAction != null ) msgs = ( ( InternalEObject ) lineJumpingAction ).eInverseRemove( this,
                    CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS, JumperAction.class, msgs );
            if( newLineJumpingAction != null ) msgs = ( ( InternalEObject ) newLineJumpingAction ).eInverseAdd( this,
                    CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS, JumperAction.class, msgs );
            msgs = basicSetLineJumpingAction( newLineJumpingAction, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLineJumpingActionESet = lineJumpingActionESet;
            lineJumpingActionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION,
                        newLineJumpingAction, newLineJumpingAction, !oldLineJumpingActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLineJumpingAction( NotificationChain msgs ) {
        JumperAction oldLineJumpingAction = lineJumpingAction;
        lineJumpingAction = null;
        boolean oldLineJumpingActionESet = lineJumpingActionESet;
        lineJumpingActionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION, oldLineJumpingAction, null,
                    oldLineJumpingActionESet );
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
    public void unsetLineJumpingAction() {
        if( lineJumpingAction != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) lineJumpingAction ).eInverseRemove( this,
                    CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS, JumperAction.class, msgs );
            msgs = basicUnsetLineJumpingAction( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLineJumpingActionESet = lineJumpingActionESet;
            lineJumpingActionESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION, null, null, oldLineJumpingActionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLineJumpingAction() {
        return lineJumpingActionESet;
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
        case CimPackage.AC_LINE_SEGMENT__LINE_FAULTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLineFaults() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getClamp() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE:
            if( perLengthImpedance != null ) msgs = ( ( InternalEObject ) perLengthImpedance ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_IMPEDANCE__AC_LINE_SEGMENTS, PerLengthImpedance.class, msgs );
            return basicSetPerLengthImpedance( ( PerLengthImpedance ) otherEnd, msgs );
        case CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION:
            if( lineGroundingAction != null ) msgs = ( ( InternalEObject ) lineGroundingAction ).eInverseRemove( this,
                    CimPackage.GROUND_ACTION__ALONG_AC_LINE_SEGMENT, GroundAction.class, msgs );
            return basicSetLineGroundingAction( ( GroundAction ) otherEnd, msgs );
        case CimPackage.AC_LINE_SEGMENT__CUT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCut() ).basicAdd( otherEnd, msgs );
        case CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION:
            if( lineJumpingAction != null ) msgs = ( ( InternalEObject ) lineJumpingAction ).eInverseRemove( this,
                    CimPackage.JUMPER_ACTION__ALONG_AC_LINE_SEGMENTS, JumperAction.class, msgs );
            return basicSetLineJumpingAction( ( JumperAction ) otherEnd, msgs );
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
        case CimPackage.AC_LINE_SEGMENT__LINE_FAULTS:
            return ( ( InternalEList< ? > ) getLineFaults() ).basicRemove( otherEnd, msgs );
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            return ( ( InternalEList< ? > ) getClamp() ).basicRemove( otherEnd, msgs );
        case CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE:
            return basicUnsetPerLengthImpedance( msgs );
        case CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION:
            return basicUnsetLineGroundingAction( msgs );
        case CimPackage.AC_LINE_SEGMENT__CUT:
            return ( ( InternalEList< ? > ) getCut() ).basicRemove( otherEnd, msgs );
        case CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION:
            return basicUnsetLineJumpingAction( msgs );
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
        case CimPackage.AC_LINE_SEGMENT__B0CH:
            return getB0ch();
        case CimPackage.AC_LINE_SEGMENT__BCH:
            return getBch();
        case CimPackage.AC_LINE_SEGMENT__G0CH:
            return getG0ch();
        case CimPackage.AC_LINE_SEGMENT__GCH:
            return getGch();
        case CimPackage.AC_LINE_SEGMENT__R:
            return getR();
        case CimPackage.AC_LINE_SEGMENT__R0:
            return getR0();
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
            return getShortCircuitEndTemperature();
        case CimPackage.AC_LINE_SEGMENT__X:
            return getX();
        case CimPackage.AC_LINE_SEGMENT__X0:
            return getX0();
        case CimPackage.AC_LINE_SEGMENT__LINE_FAULTS:
            return getLineFaults();
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            return getClamp();
        case CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE:
            return getPerLengthImpedance();
        case CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION:
            return getLineGroundingAction();
        case CimPackage.AC_LINE_SEGMENT__CUT:
            return getCut();
        case CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION:
            return getLineJumpingAction();
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
        case CimPackage.AC_LINE_SEGMENT__B0CH:
            setB0ch( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__BCH:
            setBch( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__G0CH:
            setG0ch( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__GCH:
            setGch( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
            setShortCircuitEndTemperature( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__LINE_FAULTS:
            getLineFaults().clear();
            getLineFaults().addAll( ( Collection< ? extends LineFault > ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            getClamp().clear();
            getClamp().addAll( ( Collection< ? extends Clamp > ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE:
            setPerLengthImpedance( ( PerLengthImpedance ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION:
            setLineGroundingAction( ( GroundAction ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__CUT:
            getCut().clear();
            getCut().addAll( ( Collection< ? extends Cut > ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION:
            setLineJumpingAction( ( JumperAction ) newValue );
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
        case CimPackage.AC_LINE_SEGMENT__B0CH:
            unsetB0ch();
            return;
        case CimPackage.AC_LINE_SEGMENT__BCH:
            unsetBch();
            return;
        case CimPackage.AC_LINE_SEGMENT__G0CH:
            unsetG0ch();
            return;
        case CimPackage.AC_LINE_SEGMENT__GCH:
            unsetGch();
            return;
        case CimPackage.AC_LINE_SEGMENT__R:
            unsetR();
            return;
        case CimPackage.AC_LINE_SEGMENT__R0:
            unsetR0();
            return;
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
            unsetShortCircuitEndTemperature();
            return;
        case CimPackage.AC_LINE_SEGMENT__X:
            unsetX();
            return;
        case CimPackage.AC_LINE_SEGMENT__X0:
            unsetX0();
            return;
        case CimPackage.AC_LINE_SEGMENT__LINE_FAULTS:
            unsetLineFaults();
            return;
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            unsetClamp();
            return;
        case CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE:
            unsetPerLengthImpedance();
            return;
        case CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION:
            unsetLineGroundingAction();
            return;
        case CimPackage.AC_LINE_SEGMENT__CUT:
            unsetCut();
            return;
        case CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION:
            unsetLineJumpingAction();
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
        case CimPackage.AC_LINE_SEGMENT__B0CH:
            return isSetB0ch();
        case CimPackage.AC_LINE_SEGMENT__BCH:
            return isSetBch();
        case CimPackage.AC_LINE_SEGMENT__G0CH:
            return isSetG0ch();
        case CimPackage.AC_LINE_SEGMENT__GCH:
            return isSetGch();
        case CimPackage.AC_LINE_SEGMENT__R:
            return isSetR();
        case CimPackage.AC_LINE_SEGMENT__R0:
            return isSetR0();
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
            return isSetShortCircuitEndTemperature();
        case CimPackage.AC_LINE_SEGMENT__X:
            return isSetX();
        case CimPackage.AC_LINE_SEGMENT__X0:
            return isSetX0();
        case CimPackage.AC_LINE_SEGMENT__LINE_FAULTS:
            return isSetLineFaults();
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            return isSetClamp();
        case CimPackage.AC_LINE_SEGMENT__PER_LENGTH_IMPEDANCE:
            return isSetPerLengthImpedance();
        case CimPackage.AC_LINE_SEGMENT__LINE_GROUNDING_ACTION:
            return isSetLineGroundingAction();
        case CimPackage.AC_LINE_SEGMENT__CUT:
            return isSetCut();
        case CimPackage.AC_LINE_SEGMENT__LINE_JUMPING_ACTION:
            return isSetLineJumpingAction();
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
        result.append( ", shortCircuitEndTemperature: " );
        if( shortCircuitEndTemperatureESet )
            result.append( shortCircuitEndTemperature );
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

} //ACLineSegmentImpl
