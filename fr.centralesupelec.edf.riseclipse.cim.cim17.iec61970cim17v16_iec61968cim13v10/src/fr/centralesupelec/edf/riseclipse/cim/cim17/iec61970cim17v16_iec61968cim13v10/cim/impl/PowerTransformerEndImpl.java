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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindingConnection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Transformer End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getB0 <em>B0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getG0 <em>G0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getPhaseAngleClock <em>Phase Angle Clock</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerEndImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerTransformerEndImpl extends TransformerEndImpl implements PowerTransformerEnd {
    /**
     * The default value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected static final Float B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected Float b = B_EDEFAULT;

    /**
     * This is true if the B attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bESet;

    /**
     * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0()
     * @generated
     * @ordered
     */
    protected static final Float B0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0()
     * @generated
     * @ordered
     */
    protected Float b0 = B0_EDEFAULT;

    /**
     * This is true if the B0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b0ESet;

    /**
     * The default value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionKind()
     * @generated
     * @ordered
     */
    protected static final WindingConnection CONNECTION_KIND_EDEFAULT = WindingConnection.D;

    /**
     * The cached value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionKind()
     * @generated
     * @ordered
     */
    protected WindingConnection connectionKind = CONNECTION_KIND_EDEFAULT;

    /**
     * This is true if the Connection Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectionKindESet;

    /**
     * The default value of the '{@link #getG() <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG()
     * @generated
     * @ordered
     */
    protected static final Float G_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG() <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG()
     * @generated
     * @ordered
     */
    protected Float g = G_EDEFAULT;

    /**
     * This is true if the G attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gESet;

    /**
     * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0()
     * @generated
     * @ordered
     */
    protected static final Float G0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0()
     * @generated
     * @ordered
     */
    protected Float g0 = G0_EDEFAULT;

    /**
     * This is true if the G0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g0ESet;

    /**
     * The default value of the '{@link #getPhaseAngleClock() <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseAngleClock()
     * @generated
     * @ordered
     */
    protected static final Integer PHASE_ANGLE_CLOCK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhaseAngleClock() <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseAngleClock()
     * @generated
     * @ordered
     */
    protected Integer phaseAngleClock = PHASE_ANGLE_CLOCK_EDEFAULT;

    /**
     * This is true if the Phase Angle Clock attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseAngleClockESet;

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
     * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected static final Float RATED_S_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected Float ratedS = RATED_S_EDEFAULT;

    /**
     * This is true if the Rated S attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedSESet;

    /**
     * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected static final Float RATED_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected Float ratedU = RATED_U_EDEFAULT;

    /**
     * This is true if the Rated U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedUESet;

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
     * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerTransformer()
     * @generated
     * @ordered
     */
    protected PowerTransformer powerTransformer;

    /**
     * This is true if the Power Transformer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerTransformerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerTransformerEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerTransformerEnd();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getB() {
        return b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB( Float newB ) {
        Float oldB = b;
        b = newB;
        boolean oldBESet = bESet;
        bESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER_END__B, oldB, b, !oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB() {
        Float oldB = b;
        boolean oldBESet = bESet;
        b = B_EDEFAULT;
        bESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER_END__B, oldB, B_EDEFAULT, oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB() {
        return bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getB0() {
        return b0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB0( Float newB0 ) {
        Float oldB0 = b0;
        b0 = newB0;
        boolean oldB0ESet = b0ESet;
        b0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER_END__B0, oldB0, b0, !oldB0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB0() {
        Float oldB0 = b0;
        boolean oldB0ESet = b0ESet;
        b0 = B0_EDEFAULT;
        b0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER_END__B0, oldB0, B0_EDEFAULT, oldB0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB0() {
        return b0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindingConnection getConnectionKind() {
        return connectionKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectionKind( WindingConnection newConnectionKind ) {
        WindingConnection oldConnectionKind = connectionKind;
        connectionKind = newConnectionKind == null ? CONNECTION_KIND_EDEFAULT : newConnectionKind;
        boolean oldConnectionKindESet = connectionKindESet;
        connectionKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND,
                    oldConnectionKind, connectionKind, !oldConnectionKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectionKind() {
        WindingConnection oldConnectionKind = connectionKind;
        boolean oldConnectionKindESet = connectionKindESet;
        connectionKind = CONNECTION_KIND_EDEFAULT;
        connectionKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND,
                    oldConnectionKind, CONNECTION_KIND_EDEFAULT, oldConnectionKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectionKind() {
        return connectionKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG() {
        return g;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG( Float newG ) {
        Float oldG = g;
        g = newG;
        boolean oldGESet = gESet;
        gESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER_END__G, oldG, g, !oldGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG() {
        Float oldG = g;
        boolean oldGESet = gESet;
        g = G_EDEFAULT;
        gESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER_END__G, oldG, G_EDEFAULT, oldGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG() {
        return gESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG0() {
        return g0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG0( Float newG0 ) {
        Float oldG0 = g0;
        g0 = newG0;
        boolean oldG0ESet = g0ESet;
        g0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER_END__G0, oldG0, g0, !oldG0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG0() {
        Float oldG0 = g0;
        boolean oldG0ESet = g0ESet;
        g0 = G0_EDEFAULT;
        g0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER_END__G0, oldG0, G0_EDEFAULT, oldG0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG0() {
        return g0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPhaseAngleClock() {
        return phaseAngleClock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseAngleClock( Integer newPhaseAngleClock ) {
        Integer oldPhaseAngleClock = phaseAngleClock;
        phaseAngleClock = newPhaseAngleClock;
        boolean oldPhaseAngleClockESet = phaseAngleClockESet;
        phaseAngleClockESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK,
                    oldPhaseAngleClock, phaseAngleClock, !oldPhaseAngleClockESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseAngleClock() {
        Integer oldPhaseAngleClock = phaseAngleClock;
        boolean oldPhaseAngleClockESet = phaseAngleClockESet;
        phaseAngleClock = PHASE_ANGLE_CLOCK_EDEFAULT;
        phaseAngleClockESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK,
                        oldPhaseAngleClock, PHASE_ANGLE_CLOCK_EDEFAULT, oldPhaseAngleClockESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseAngleClock() {
        return phaseAngleClockESet;
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
                CimPackage.POWER_TRANSFORMER_END__R, oldR, r, !oldRESet ) );
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
                CimPackage.POWER_TRANSFORMER_END__R, oldR, R_EDEFAULT, oldRESet ) );
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
                CimPackage.POWER_TRANSFORMER_END__R0, oldR0, r0, !oldR0ESet ) );
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
                CimPackage.POWER_TRANSFORMER_END__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
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
    public Float getRatedS() {
        return ratedS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedS( Float newRatedS ) {
        Float oldRatedS = ratedS;
        ratedS = newRatedS;
        boolean oldRatedSESet = ratedSESet;
        ratedSESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER_END__RATED_S, oldRatedS, ratedS, !oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedS() {
        Float oldRatedS = ratedS;
        boolean oldRatedSESet = ratedSESet;
        ratedS = RATED_S_EDEFAULT;
        ratedSESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER_END__RATED_S, oldRatedS, RATED_S_EDEFAULT, oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedS() {
        return ratedSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedU() {
        return ratedU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedU( Float newRatedU ) {
        Float oldRatedU = ratedU;
        ratedU = newRatedU;
        boolean oldRatedUESet = ratedUESet;
        ratedUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER_END__RATED_U, oldRatedU, ratedU, !oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedU() {
        Float oldRatedU = ratedU;
        boolean oldRatedUESet = ratedUESet;
        ratedU = RATED_U_EDEFAULT;
        ratedUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER_END__RATED_U, oldRatedU, RATED_U_EDEFAULT, oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedU() {
        return ratedUESet;
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
                CimPackage.POWER_TRANSFORMER_END__X, oldX, x, !oldXESet ) );
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
                CimPackage.POWER_TRANSFORMER_END__X, oldX, X_EDEFAULT, oldXESet ) );
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
                CimPackage.POWER_TRANSFORMER_END__X0, oldX0, x0, !oldX0ESet ) );
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
                CimPackage.POWER_TRANSFORMER_END__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
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
    public PowerTransformer getPowerTransformer() {
        return powerTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerTransformer( PowerTransformer newPowerTransformer, NotificationChain msgs ) {
        PowerTransformer oldPowerTransformer = powerTransformer;
        powerTransformer = newPowerTransformer;
        boolean oldPowerTransformerESet = powerTransformerESet;
        powerTransformerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER, oldPowerTransformer, newPowerTransformer,
                    !oldPowerTransformerESet );
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
    public void setPowerTransformer( PowerTransformer newPowerTransformer ) {
        if( newPowerTransformer != powerTransformer ) {
            NotificationChain msgs = null;
            if( powerTransformer != null ) msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs );
            if( newPowerTransformer != null ) msgs = ( ( InternalEObject ) newPowerTransformer ).eInverseAdd( this,
                    CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs );
            msgs = basicSetPowerTransformer( newPowerTransformer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerTransformerESet = powerTransformerESet;
            powerTransformerESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER,
                            newPowerTransformer, newPowerTransformer, !oldPowerTransformerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerTransformer( NotificationChain msgs ) {
        PowerTransformer oldPowerTransformer = powerTransformer;
        powerTransformer = null;
        boolean oldPowerTransformerESet = powerTransformerESet;
        powerTransformerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER, oldPowerTransformer, null,
                    oldPowerTransformerESet );
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
    public void unsetPowerTransformer() {
        if( powerTransformer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs );
            msgs = basicUnsetPowerTransformer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerTransformerESet = powerTransformerESet;
            powerTransformerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER, null, null, oldPowerTransformerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerTransformer() {
        return powerTransformerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            if( powerTransformer != null ) msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs );
            return basicSetPowerTransformer( ( PowerTransformer ) otherEnd, msgs );
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
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            return basicUnsetPowerTransformer( msgs );
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
        case CimPackage.POWER_TRANSFORMER_END__B:
            return getB();
        case CimPackage.POWER_TRANSFORMER_END__B0:
            return getB0();
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
            return getConnectionKind();
        case CimPackage.POWER_TRANSFORMER_END__G:
            return getG();
        case CimPackage.POWER_TRANSFORMER_END__G0:
            return getG0();
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
            return getPhaseAngleClock();
        case CimPackage.POWER_TRANSFORMER_END__R:
            return getR();
        case CimPackage.POWER_TRANSFORMER_END__R0:
            return getR0();
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
            return getRatedS();
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
            return getRatedU();
        case CimPackage.POWER_TRANSFORMER_END__X:
            return getX();
        case CimPackage.POWER_TRANSFORMER_END__X0:
            return getX0();
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            return getPowerTransformer();
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
        case CimPackage.POWER_TRANSFORMER_END__B:
            setB( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__B0:
            setB0( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
            setConnectionKind( ( WindingConnection ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__G:
            setG( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__G0:
            setG0( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
            setPhaseAngleClock( ( Integer ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
            setRatedS( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
            setRatedU( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            setPowerTransformer( ( PowerTransformer ) newValue );
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
        case CimPackage.POWER_TRANSFORMER_END__B:
            unsetB();
            return;
        case CimPackage.POWER_TRANSFORMER_END__B0:
            unsetB0();
            return;
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
            unsetConnectionKind();
            return;
        case CimPackage.POWER_TRANSFORMER_END__G:
            unsetG();
            return;
        case CimPackage.POWER_TRANSFORMER_END__G0:
            unsetG0();
            return;
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
            unsetPhaseAngleClock();
            return;
        case CimPackage.POWER_TRANSFORMER_END__R:
            unsetR();
            return;
        case CimPackage.POWER_TRANSFORMER_END__R0:
            unsetR0();
            return;
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
            unsetRatedS();
            return;
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
            unsetRatedU();
            return;
        case CimPackage.POWER_TRANSFORMER_END__X:
            unsetX();
            return;
        case CimPackage.POWER_TRANSFORMER_END__X0:
            unsetX0();
            return;
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            unsetPowerTransformer();
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
        case CimPackage.POWER_TRANSFORMER_END__B:
            return isSetB();
        case CimPackage.POWER_TRANSFORMER_END__B0:
            return isSetB0();
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
            return isSetConnectionKind();
        case CimPackage.POWER_TRANSFORMER_END__G:
            return isSetG();
        case CimPackage.POWER_TRANSFORMER_END__G0:
            return isSetG0();
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
            return isSetPhaseAngleClock();
        case CimPackage.POWER_TRANSFORMER_END__R:
            return isSetR();
        case CimPackage.POWER_TRANSFORMER_END__R0:
            return isSetR0();
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
            return isSetRatedS();
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
            return isSetRatedU();
        case CimPackage.POWER_TRANSFORMER_END__X:
            return isSetX();
        case CimPackage.POWER_TRANSFORMER_END__X0:
            return isSetX0();
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            return isSetPowerTransformer();
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
        result.append( " (b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", b0: " );
        if( b0ESet )
            result.append( b0 );
        else
            result.append( "<unset>" );
        result.append( ", connectionKind: " );
        if( connectionKindESet )
            result.append( connectionKind );
        else
            result.append( "<unset>" );
        result.append( ", g: " );
        if( gESet )
            result.append( g );
        else
            result.append( "<unset>" );
        result.append( ", g0: " );
        if( g0ESet )
            result.append( g0 );
        else
            result.append( "<unset>" );
        result.append( ", phaseAngleClock: " );
        if( phaseAngleClockESet )
            result.append( phaseAngleClock );
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
        result.append( ", ratedS: " );
        if( ratedSESet )
            result.append( ratedS );
        else
            result.append( "<unset>" );
        result.append( ", ratedU: " );
        if( ratedUESet )
            result.append( ratedU );
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

} //PowerTransformerEndImpl
