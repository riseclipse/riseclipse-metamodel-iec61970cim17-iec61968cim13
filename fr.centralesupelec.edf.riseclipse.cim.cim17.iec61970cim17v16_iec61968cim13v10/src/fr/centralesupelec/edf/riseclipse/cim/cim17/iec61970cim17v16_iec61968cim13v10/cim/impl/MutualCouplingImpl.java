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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutual Coupling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getDistance11 <em>Distance11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getDistance12 <em>Distance12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getDistance21 <em>Distance21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getDistance22 <em>Distance22</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getSecond_Terminal <em>Second Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MutualCouplingImpl#getFirst_Terminal <em>First Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutualCouplingImpl extends IdentifiedObjectImpl implements MutualCoupling {
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
     * The default value of the '{@link #getDistance11() <em>Distance11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistance11()
     * @generated
     * @ordered
     */
    protected static final Float DISTANCE11_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDistance11() <em>Distance11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistance11()
     * @generated
     * @ordered
     */
    protected Float distance11 = DISTANCE11_EDEFAULT;

    /**
     * This is true if the Distance11 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean distance11ESet;

    /**
     * The default value of the '{@link #getDistance12() <em>Distance12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistance12()
     * @generated
     * @ordered
     */
    protected static final Float DISTANCE12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDistance12() <em>Distance12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistance12()
     * @generated
     * @ordered
     */
    protected Float distance12 = DISTANCE12_EDEFAULT;

    /**
     * This is true if the Distance12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean distance12ESet;

    /**
     * The default value of the '{@link #getDistance21() <em>Distance21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistance21()
     * @generated
     * @ordered
     */
    protected static final Float DISTANCE21_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDistance21() <em>Distance21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistance21()
     * @generated
     * @ordered
     */
    protected Float distance21 = DISTANCE21_EDEFAULT;

    /**
     * This is true if the Distance21 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean distance21ESet;

    /**
     * The default value of the '{@link #getDistance22() <em>Distance22</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistance22()
     * @generated
     * @ordered
     */
    protected static final Float DISTANCE22_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDistance22() <em>Distance22</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDistance22()
     * @generated
     * @ordered
     */
    protected Float distance22 = DISTANCE22_EDEFAULT;

    /**
     * This is true if the Distance22 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean distance22ESet;

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
     * The cached value of the '{@link #getSecond_Terminal() <em>Second Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSecond_Terminal()
     * @generated
     * @ordered
     */
    protected Terminal second_Terminal;

    /**
     * This is true if the Second Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean second_TerminalESet;

    /**
     * The cached value of the '{@link #getFirst_Terminal() <em>First Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFirst_Terminal()
     * @generated
     * @ordered
     */
    protected Terminal first_Terminal;

    /**
     * This is true if the First Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean first_TerminalESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MutualCouplingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMutualCoupling();
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
                CimPackage.MUTUAL_COUPLING__B0CH, oldB0ch, b0ch, !oldB0chESet ) );
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
                CimPackage.MUTUAL_COUPLING__B0CH, oldB0ch, B0CH_EDEFAULT, oldB0chESet ) );
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
    public Float getDistance11() {
        return distance11;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDistance11( Float newDistance11 ) {
        Float oldDistance11 = distance11;
        distance11 = newDistance11;
        boolean oldDistance11ESet = distance11ESet;
        distance11ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MUTUAL_COUPLING__DISTANCE11, oldDistance11, distance11, !oldDistance11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDistance11() {
        Float oldDistance11 = distance11;
        boolean oldDistance11ESet = distance11ESet;
        distance11 = DISTANCE11_EDEFAULT;
        distance11ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MUTUAL_COUPLING__DISTANCE11, oldDistance11, DISTANCE11_EDEFAULT, oldDistance11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDistance11() {
        return distance11ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDistance12() {
        return distance12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDistance12( Float newDistance12 ) {
        Float oldDistance12 = distance12;
        distance12 = newDistance12;
        boolean oldDistance12ESet = distance12ESet;
        distance12ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MUTUAL_COUPLING__DISTANCE12, oldDistance12, distance12, !oldDistance12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDistance12() {
        Float oldDistance12 = distance12;
        boolean oldDistance12ESet = distance12ESet;
        distance12 = DISTANCE12_EDEFAULT;
        distance12ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MUTUAL_COUPLING__DISTANCE12, oldDistance12, DISTANCE12_EDEFAULT, oldDistance12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDistance12() {
        return distance12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDistance21() {
        return distance21;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDistance21( Float newDistance21 ) {
        Float oldDistance21 = distance21;
        distance21 = newDistance21;
        boolean oldDistance21ESet = distance21ESet;
        distance21ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MUTUAL_COUPLING__DISTANCE21, oldDistance21, distance21, !oldDistance21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDistance21() {
        Float oldDistance21 = distance21;
        boolean oldDistance21ESet = distance21ESet;
        distance21 = DISTANCE21_EDEFAULT;
        distance21ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MUTUAL_COUPLING__DISTANCE21, oldDistance21, DISTANCE21_EDEFAULT, oldDistance21ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDistance21() {
        return distance21ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDistance22() {
        return distance22;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDistance22( Float newDistance22 ) {
        Float oldDistance22 = distance22;
        distance22 = newDistance22;
        boolean oldDistance22ESet = distance22ESet;
        distance22ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MUTUAL_COUPLING__DISTANCE22, oldDistance22, distance22, !oldDistance22ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDistance22() {
        Float oldDistance22 = distance22;
        boolean oldDistance22ESet = distance22ESet;
        distance22 = DISTANCE22_EDEFAULT;
        distance22ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MUTUAL_COUPLING__DISTANCE22, oldDistance22, DISTANCE22_EDEFAULT, oldDistance22ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDistance22() {
        return distance22ESet;
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
                CimPackage.MUTUAL_COUPLING__G0CH, oldG0ch, g0ch, !oldG0chESet ) );
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
                CimPackage.MUTUAL_COUPLING__G0CH, oldG0ch, G0CH_EDEFAULT, oldG0chESet ) );
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
                CimPackage.MUTUAL_COUPLING__R0, oldR0, r0, !oldR0ESet ) );
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
                CimPackage.MUTUAL_COUPLING__R0, oldR0, R0_EDEFAULT, oldR0ESet ) );
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
                CimPackage.MUTUAL_COUPLING__X0, oldX0, x0, !oldX0ESet ) );
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
                CimPackage.MUTUAL_COUPLING__X0, oldX0, X0_EDEFAULT, oldX0ESet ) );
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
    public Terminal getSecond_Terminal() {
        return second_Terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSecond_Terminal( Terminal newSecond_Terminal, NotificationChain msgs ) {
        Terminal oldSecond_Terminal = second_Terminal;
        second_Terminal = newSecond_Terminal;
        boolean oldSecond_TerminalESet = second_TerminalESet;
        second_TerminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL, oldSecond_Terminal, newSecond_Terminal,
                    !oldSecond_TerminalESet );
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
    public void setSecond_Terminal( Terminal newSecond_Terminal ) {
        if( newSecond_Terminal != second_Terminal ) {
            NotificationChain msgs = null;
            if( second_Terminal != null ) msgs = ( ( InternalEObject ) second_Terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs );
            if( newSecond_Terminal != null ) msgs = ( ( InternalEObject ) newSecond_Terminal ).eInverseAdd( this,
                    CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs );
            msgs = basicSetSecond_Terminal( newSecond_Terminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSecond_TerminalESet = second_TerminalESet;
            second_TerminalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL,
                        newSecond_Terminal, newSecond_Terminal, !oldSecond_TerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSecond_Terminal( NotificationChain msgs ) {
        Terminal oldSecond_Terminal = second_Terminal;
        second_Terminal = null;
        boolean oldSecond_TerminalESet = second_TerminalESet;
        second_TerminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL, oldSecond_Terminal, null, oldSecond_TerminalESet );
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
    public void unsetSecond_Terminal() {
        if( second_Terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) second_Terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs );
            msgs = basicUnsetSecond_Terminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSecond_TerminalESet = second_TerminalESet;
            second_TerminalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL, null, null, oldSecond_TerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSecond_Terminal() {
        return second_TerminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal getFirst_Terminal() {
        return first_Terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFirst_Terminal( Terminal newFirst_Terminal, NotificationChain msgs ) {
        Terminal oldFirst_Terminal = first_Terminal;
        first_Terminal = newFirst_Terminal;
        boolean oldFirst_TerminalESet = first_TerminalESet;
        first_TerminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL, oldFirst_Terminal, newFirst_Terminal,
                    !oldFirst_TerminalESet );
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
    public void setFirst_Terminal( Terminal newFirst_Terminal ) {
        if( newFirst_Terminal != first_Terminal ) {
            NotificationChain msgs = null;
            if( first_Terminal != null ) msgs = ( ( InternalEObject ) first_Terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs );
            if( newFirst_Terminal != null ) msgs = ( ( InternalEObject ) newFirst_Terminal ).eInverseAdd( this,
                    CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs );
            msgs = basicSetFirst_Terminal( newFirst_Terminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFirst_TerminalESet = first_TerminalESet;
            first_TerminalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL,
                        newFirst_Terminal, newFirst_Terminal, !oldFirst_TerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetFirst_Terminal( NotificationChain msgs ) {
        Terminal oldFirst_Terminal = first_Terminal;
        first_Terminal = null;
        boolean oldFirst_TerminalESet = first_TerminalESet;
        first_TerminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL, oldFirst_Terminal, null, oldFirst_TerminalESet );
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
    public void unsetFirst_Terminal() {
        if( first_Terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) first_Terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs );
            msgs = basicUnsetFirst_Terminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldFirst_TerminalESet = first_TerminalESet;
            first_TerminalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL, null, null, oldFirst_TerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFirst_Terminal() {
        return first_TerminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
            if( second_Terminal != null ) msgs = ( ( InternalEObject ) second_Terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING, Terminal.class, msgs );
            return basicSetSecond_Terminal( ( Terminal ) otherEnd, msgs );
        case CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
            if( first_Terminal != null ) msgs = ( ( InternalEObject ) first_Terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING, Terminal.class, msgs );
            return basicSetFirst_Terminal( ( Terminal ) otherEnd, msgs );
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
        case CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
            return basicUnsetSecond_Terminal( msgs );
        case CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
            return basicUnsetFirst_Terminal( msgs );
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
        case CimPackage.MUTUAL_COUPLING__B0CH:
            return getB0ch();
        case CimPackage.MUTUAL_COUPLING__DISTANCE11:
            return getDistance11();
        case CimPackage.MUTUAL_COUPLING__DISTANCE12:
            return getDistance12();
        case CimPackage.MUTUAL_COUPLING__DISTANCE21:
            return getDistance21();
        case CimPackage.MUTUAL_COUPLING__DISTANCE22:
            return getDistance22();
        case CimPackage.MUTUAL_COUPLING__G0CH:
            return getG0ch();
        case CimPackage.MUTUAL_COUPLING__R0:
            return getR0();
        case CimPackage.MUTUAL_COUPLING__X0:
            return getX0();
        case CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
            return getSecond_Terminal();
        case CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
            return getFirst_Terminal();
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
        case CimPackage.MUTUAL_COUPLING__B0CH:
            setB0ch( ( Float ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__DISTANCE11:
            setDistance11( ( Float ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__DISTANCE12:
            setDistance12( ( Float ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__DISTANCE21:
            setDistance21( ( Float ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__DISTANCE22:
            setDistance22( ( Float ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__G0CH:
            setG0ch( ( Float ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__R0:
            setR0( ( Float ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__X0:
            setX0( ( Float ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
            setSecond_Terminal( ( Terminal ) newValue );
            return;
        case CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
            setFirst_Terminal( ( Terminal ) newValue );
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
        case CimPackage.MUTUAL_COUPLING__B0CH:
            unsetB0ch();
            return;
        case CimPackage.MUTUAL_COUPLING__DISTANCE11:
            unsetDistance11();
            return;
        case CimPackage.MUTUAL_COUPLING__DISTANCE12:
            unsetDistance12();
            return;
        case CimPackage.MUTUAL_COUPLING__DISTANCE21:
            unsetDistance21();
            return;
        case CimPackage.MUTUAL_COUPLING__DISTANCE22:
            unsetDistance22();
            return;
        case CimPackage.MUTUAL_COUPLING__G0CH:
            unsetG0ch();
            return;
        case CimPackage.MUTUAL_COUPLING__R0:
            unsetR0();
            return;
        case CimPackage.MUTUAL_COUPLING__X0:
            unsetX0();
            return;
        case CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
            unsetSecond_Terminal();
            return;
        case CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
            unsetFirst_Terminal();
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
        case CimPackage.MUTUAL_COUPLING__B0CH:
            return isSetB0ch();
        case CimPackage.MUTUAL_COUPLING__DISTANCE11:
            return isSetDistance11();
        case CimPackage.MUTUAL_COUPLING__DISTANCE12:
            return isSetDistance12();
        case CimPackage.MUTUAL_COUPLING__DISTANCE21:
            return isSetDistance21();
        case CimPackage.MUTUAL_COUPLING__DISTANCE22:
            return isSetDistance22();
        case CimPackage.MUTUAL_COUPLING__G0CH:
            return isSetG0ch();
        case CimPackage.MUTUAL_COUPLING__R0:
            return isSetR0();
        case CimPackage.MUTUAL_COUPLING__X0:
            return isSetX0();
        case CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL:
            return isSetSecond_Terminal();
        case CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL:
            return isSetFirst_Terminal();
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
        result.append( " (b0ch: " );
        if( b0chESet )
            result.append( b0ch );
        else
            result.append( "<unset>" );
        result.append( ", distance11: " );
        if( distance11ESet )
            result.append( distance11 );
        else
            result.append( "<unset>" );
        result.append( ", distance12: " );
        if( distance12ESet )
            result.append( distance12 );
        else
            result.append( "<unset>" );
        result.append( ", distance21: " );
        if( distance21ESet )
            result.append( distance21 );
        else
            result.append( "<unset>" );
        result.append( ", distance22: " );
        if( distance22ESet )
            result.append( distance22 );
        else
            result.append( "<unset>" );
        result.append( ", g0ch: " );
        if( g0chESet )
            result.append( g0ch );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
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

} //MutualCouplingImpl
