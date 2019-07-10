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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PerLengthPhaseImpedance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseImpedanceData;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Impedance Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseImpedanceDataImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseImpedanceDataImpl#getFromPhase <em>From Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseImpedanceDataImpl#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseImpedanceDataImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseImpedanceDataImpl#getToPhase <em>To Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseImpedanceDataImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PhaseImpedanceDataImpl#getPhaseImpedance <em>Phase Impedance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseImpedanceDataImpl extends CimObjectWithIDImpl implements PhaseImpedanceData {
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
     * The default value of the '{@link #getFromPhase() <em>From Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromPhase()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind FROM_PHASE_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getFromPhase() <em>From Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromPhase()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind fromPhase = FROM_PHASE_EDEFAULT;

    /**
     * This is true if the From Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fromPhaseESet;

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
     * The default value of the '{@link #getToPhase() <em>To Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToPhase()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind TO_PHASE_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getToPhase() <em>To Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToPhase()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind toPhase = TO_PHASE_EDEFAULT;

    /**
     * This is true if the To Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean toPhaseESet;

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
     * The cached value of the '{@link #getPhaseImpedance() <em>Phase Impedance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseImpedance()
     * @generated
     * @ordered
     */
    protected PerLengthPhaseImpedance phaseImpedance;

    /**
     * This is true if the Phase Impedance reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseImpedanceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhaseImpedanceDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPhaseImpedanceData();
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
                CimPackage.PHASE_IMPEDANCE_DATA__B, oldB, b, !oldBESet ) );
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
                CimPackage.PHASE_IMPEDANCE_DATA__B, oldB, B_EDEFAULT, oldBESet ) );
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
    public SinglePhaseKind getFromPhase() {
        return fromPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromPhase( SinglePhaseKind newFromPhase ) {
        SinglePhaseKind oldFromPhase = fromPhase;
        fromPhase = newFromPhase == null ? FROM_PHASE_EDEFAULT : newFromPhase;
        boolean oldFromPhaseESet = fromPhaseESet;
        fromPhaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PHASE_IMPEDANCE_DATA__FROM_PHASE, oldFromPhase, fromPhase, !oldFromPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFromPhase() {
        SinglePhaseKind oldFromPhase = fromPhase;
        boolean oldFromPhaseESet = fromPhaseESet;
        fromPhase = FROM_PHASE_EDEFAULT;
        fromPhaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PHASE_IMPEDANCE_DATA__FROM_PHASE, oldFromPhase, FROM_PHASE_EDEFAULT, oldFromPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFromPhase() {
        return fromPhaseESet;
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
                CimPackage.PHASE_IMPEDANCE_DATA__G, oldG, g, !oldGESet ) );
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
                CimPackage.PHASE_IMPEDANCE_DATA__G, oldG, G_EDEFAULT, oldGESet ) );
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
                CimPackage.PHASE_IMPEDANCE_DATA__R, oldR, r, !oldRESet ) );
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
                CimPackage.PHASE_IMPEDANCE_DATA__R, oldR, R_EDEFAULT, oldRESet ) );
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
    public SinglePhaseKind getToPhase() {
        return toPhase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToPhase( SinglePhaseKind newToPhase ) {
        SinglePhaseKind oldToPhase = toPhase;
        toPhase = newToPhase == null ? TO_PHASE_EDEFAULT : newToPhase;
        boolean oldToPhaseESet = toPhaseESet;
        toPhaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PHASE_IMPEDANCE_DATA__TO_PHASE, oldToPhase, toPhase, !oldToPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToPhase() {
        SinglePhaseKind oldToPhase = toPhase;
        boolean oldToPhaseESet = toPhaseESet;
        toPhase = TO_PHASE_EDEFAULT;
        toPhaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PHASE_IMPEDANCE_DATA__TO_PHASE, oldToPhase, TO_PHASE_EDEFAULT, oldToPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToPhase() {
        return toPhaseESet;
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
                CimPackage.PHASE_IMPEDANCE_DATA__X, oldX, x, !oldXESet ) );
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
                CimPackage.PHASE_IMPEDANCE_DATA__X, oldX, X_EDEFAULT, oldXESet ) );
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
    public PerLengthPhaseImpedance getPhaseImpedance() {
        return phaseImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhaseImpedance( PerLengthPhaseImpedance newPhaseImpedance,
            NotificationChain msgs ) {
        PerLengthPhaseImpedance oldPhaseImpedance = phaseImpedance;
        phaseImpedance = newPhaseImpedance;
        boolean oldPhaseImpedanceESet = phaseImpedanceESet;
        phaseImpedanceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE, oldPhaseImpedance, newPhaseImpedance,
                    !oldPhaseImpedanceESet );
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
    public void setPhaseImpedance( PerLengthPhaseImpedance newPhaseImpedance ) {
        if( newPhaseImpedance != phaseImpedance ) {
            NotificationChain msgs = null;
            if( phaseImpedance != null ) msgs = ( ( InternalEObject ) phaseImpedance ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs );
            if( newPhaseImpedance != null ) msgs = ( ( InternalEObject ) newPhaseImpedance ).eInverseAdd( this,
                    CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs );
            msgs = basicSetPhaseImpedance( newPhaseImpedance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhaseImpedanceESet = phaseImpedanceESet;
            phaseImpedanceESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE,
                            newPhaseImpedance, newPhaseImpedance, !oldPhaseImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPhaseImpedance( NotificationChain msgs ) {
        PerLengthPhaseImpedance oldPhaseImpedance = phaseImpedance;
        phaseImpedance = null;
        boolean oldPhaseImpedanceESet = phaseImpedanceESet;
        phaseImpedanceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE, oldPhaseImpedance, null, oldPhaseImpedanceESet );
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
    public void unsetPhaseImpedance() {
        if( phaseImpedance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) phaseImpedance ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs );
            msgs = basicUnsetPhaseImpedance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhaseImpedanceESet = phaseImpedanceESet;
            phaseImpedanceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE, null, null, oldPhaseImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseImpedance() {
        return phaseImpedanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
            if( phaseImpedance != null ) msgs = ( ( InternalEObject ) phaseImpedance ).eInverseRemove( this,
                    CimPackage.PER_LENGTH_PHASE_IMPEDANCE__PHASE_IMPEDANCE_DATA, PerLengthPhaseImpedance.class, msgs );
            return basicSetPhaseImpedance( ( PerLengthPhaseImpedance ) otherEnd, msgs );
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
        case CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
            return basicUnsetPhaseImpedance( msgs );
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
        case CimPackage.PHASE_IMPEDANCE_DATA__B:
            return getB();
        case CimPackage.PHASE_IMPEDANCE_DATA__FROM_PHASE:
            return getFromPhase();
        case CimPackage.PHASE_IMPEDANCE_DATA__G:
            return getG();
        case CimPackage.PHASE_IMPEDANCE_DATA__R:
            return getR();
        case CimPackage.PHASE_IMPEDANCE_DATA__TO_PHASE:
            return getToPhase();
        case CimPackage.PHASE_IMPEDANCE_DATA__X:
            return getX();
        case CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
            return getPhaseImpedance();
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
        case CimPackage.PHASE_IMPEDANCE_DATA__B:
            setB( ( Float ) newValue );
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__FROM_PHASE:
            setFromPhase( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__G:
            setG( ( Float ) newValue );
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__R:
            setR( ( Float ) newValue );
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__TO_PHASE:
            setToPhase( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__X:
            setX( ( Float ) newValue );
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
            setPhaseImpedance( ( PerLengthPhaseImpedance ) newValue );
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
        case CimPackage.PHASE_IMPEDANCE_DATA__B:
            unsetB();
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__FROM_PHASE:
            unsetFromPhase();
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__G:
            unsetG();
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__R:
            unsetR();
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__TO_PHASE:
            unsetToPhase();
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__X:
            unsetX();
            return;
        case CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
            unsetPhaseImpedance();
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
        case CimPackage.PHASE_IMPEDANCE_DATA__B:
            return isSetB();
        case CimPackage.PHASE_IMPEDANCE_DATA__FROM_PHASE:
            return isSetFromPhase();
        case CimPackage.PHASE_IMPEDANCE_DATA__G:
            return isSetG();
        case CimPackage.PHASE_IMPEDANCE_DATA__R:
            return isSetR();
        case CimPackage.PHASE_IMPEDANCE_DATA__TO_PHASE:
            return isSetToPhase();
        case CimPackage.PHASE_IMPEDANCE_DATA__X:
            return isSetX();
        case CimPackage.PHASE_IMPEDANCE_DATA__PHASE_IMPEDANCE:
            return isSetPhaseImpedance();
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
        result.append( " (b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", fromPhase: " );
        if( fromPhaseESet )
            result.append( fromPhase );
        else
            result.append( "<unset>" );
        result.append( ", g: " );
        if( gESet )
            result.append( g );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", toPhase: " );
        if( toPhaseESet )
            result.append( toPhase );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PhaseImpedanceDataImpl
