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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLim2Simplified;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underexc Lim2 Simplified</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLim2SimplifiedImpl#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLim2SimplifiedImpl#getP0 <em>P0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLim2SimplifiedImpl#getP1 <em>P1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLim2SimplifiedImpl#getQ0 <em>Q0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLim2SimplifiedImpl#getQ1 <em>Q1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLim2SimplifiedImpl#getVuimax <em>Vuimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.UnderexcLim2SimplifiedImpl#getVuimin <em>Vuimin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnderexcLim2SimplifiedImpl extends UnderexcitationLimiterDynamicsImpl implements UnderexcLim2Simplified {
    /**
     * The default value of the '{@link #getKui() <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKui()
     * @generated
     * @ordered
     */
    protected static final Float KUI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKui() <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKui()
     * @generated
     * @ordered
     */
    protected Float kui = KUI_EDEFAULT;

    /**
     * This is true if the Kui attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kuiESet;

    /**
     * The default value of the '{@link #getP0() <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP0()
     * @generated
     * @ordered
     */
    protected static final Float P0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP0() <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP0()
     * @generated
     * @ordered
     */
    protected Float p0 = P0_EDEFAULT;

    /**
     * This is true if the P0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p0ESet;

    /**
     * The default value of the '{@link #getP1() <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP1()
     * @generated
     * @ordered
     */
    protected static final Float P1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP1() <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP1()
     * @generated
     * @ordered
     */
    protected Float p1 = P1_EDEFAULT;

    /**
     * This is true if the P1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p1ESet;

    /**
     * The default value of the '{@link #getQ0() <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ0()
     * @generated
     * @ordered
     */
    protected static final Float Q0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ0() <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ0()
     * @generated
     * @ordered
     */
    protected Float q0 = Q0_EDEFAULT;

    /**
     * This is true if the Q0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q0ESet;

    /**
     * The default value of the '{@link #getQ1() <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ1()
     * @generated
     * @ordered
     */
    protected static final Float Q1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ1() <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ1()
     * @generated
     * @ordered
     */
    protected Float q1 = Q1_EDEFAULT;

    /**
     * This is true if the Q1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q1ESet;

    /**
     * The default value of the '{@link #getVuimax() <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimax()
     * @generated
     * @ordered
     */
    protected static final Float VUIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVuimax() <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimax()
     * @generated
     * @ordered
     */
    protected Float vuimax = VUIMAX_EDEFAULT;

    /**
     * This is true if the Vuimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vuimaxESet;

    /**
     * The default value of the '{@link #getVuimin() <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimin()
     * @generated
     * @ordered
     */
    protected static final Float VUIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVuimin() <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimin()
     * @generated
     * @ordered
     */
    protected Float vuimin = VUIMIN_EDEFAULT;

    /**
     * This is true if the Vuimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vuiminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnderexcLim2SimplifiedImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUnderexcLim2Simplified();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKui() {
        return kui;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKui( Float newKui ) {
        Float oldKui = kui;
        kui = newKui;
        boolean oldKuiESet = kuiESet;
        kuiESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI, oldKui, kui, !oldKuiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKui() {
        Float oldKui = kui;
        boolean oldKuiESet = kuiESet;
        kui = KUI_EDEFAULT;
        kuiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI, oldKui, KUI_EDEFAULT, oldKuiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKui() {
        return kuiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP0() {
        return p0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP0( Float newP0 ) {
        Float oldP0 = p0;
        p0 = newP0;
        boolean oldP0ESet = p0ESet;
        p0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0, oldP0, p0, !oldP0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP0() {
        Float oldP0 = p0;
        boolean oldP0ESet = p0ESet;
        p0 = P0_EDEFAULT;
        p0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0, oldP0, P0_EDEFAULT, oldP0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP0() {
        return p0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP1() {
        return p1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP1( Float newP1 ) {
        Float oldP1 = p1;
        p1 = newP1;
        boolean oldP1ESet = p1ESet;
        p1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1, oldP1, p1, !oldP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP1() {
        Float oldP1 = p1;
        boolean oldP1ESet = p1ESet;
        p1 = P1_EDEFAULT;
        p1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1, oldP1, P1_EDEFAULT, oldP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP1() {
        return p1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ0() {
        return q0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ0( Float newQ0 ) {
        Float oldQ0 = q0;
        q0 = newQ0;
        boolean oldQ0ESet = q0ESet;
        q0ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0, oldQ0, q0, !oldQ0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ0() {
        Float oldQ0 = q0;
        boolean oldQ0ESet = q0ESet;
        q0 = Q0_EDEFAULT;
        q0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0, oldQ0, Q0_EDEFAULT, oldQ0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ0() {
        return q0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQ1() {
        return q1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ1( Float newQ1 ) {
        Float oldQ1 = q1;
        q1 = newQ1;
        boolean oldQ1ESet = q1ESet;
        q1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1, oldQ1, q1, !oldQ1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ1() {
        Float oldQ1 = q1;
        boolean oldQ1ESet = q1ESet;
        q1 = Q1_EDEFAULT;
        q1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1, oldQ1, Q1_EDEFAULT, oldQ1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ1() {
        return q1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVuimax() {
        return vuimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVuimax( Float newVuimax ) {
        Float oldVuimax = vuimax;
        vuimax = newVuimax;
        boolean oldVuimaxESet = vuimaxESet;
        vuimaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX, oldVuimax, vuimax, !oldVuimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVuimax() {
        Float oldVuimax = vuimax;
        boolean oldVuimaxESet = vuimaxESet;
        vuimax = VUIMAX_EDEFAULT;
        vuimaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX, oldVuimax, VUIMAX_EDEFAULT, oldVuimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVuimax() {
        return vuimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVuimin() {
        return vuimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVuimin( Float newVuimin ) {
        Float oldVuimin = vuimin;
        vuimin = newVuimin;
        boolean oldVuiminESet = vuiminESet;
        vuiminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN, oldVuimin, vuimin, !oldVuiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVuimin() {
        Float oldVuimin = vuimin;
        boolean oldVuiminESet = vuiminESet;
        vuimin = VUIMIN_EDEFAULT;
        vuiminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN, oldVuimin, VUIMIN_EDEFAULT, oldVuiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVuimin() {
        return vuiminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
            return getKui();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
            return getP0();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
            return getP1();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
            return getQ0();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
            return getQ1();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
            return getVuimax();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
            return getVuimin();
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
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
            setKui( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
            setP0( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
            setP1( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
            setQ0( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
            setQ1( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
            setVuimax( ( Float ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
            setVuimin( ( Float ) newValue );
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
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
            unsetKui();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
            unsetP0();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
            unsetP1();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
            unsetQ0();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
            unsetQ1();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
            unsetVuimax();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
            unsetVuimin();
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
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
            return isSetKui();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
            return isSetP0();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
            return isSetP1();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
            return isSetQ0();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
            return isSetQ1();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
            return isSetVuimax();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
            return isSetVuimin();
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
        result.append( " (kui: " );
        if( kuiESet )
            result.append( kui );
        else
            result.append( "<unset>" );
        result.append( ", p0: " );
        if( p0ESet )
            result.append( p0 );
        else
            result.append( "<unset>" );
        result.append( ", p1: " );
        if( p1ESet )
            result.append( p1 );
        else
            result.append( "<unset>" );
        result.append( ", q0: " );
        if( q0ESet )
            result.append( q0 );
        else
            result.append( "<unset>" );
        result.append( ", q1: " );
        if( q1ESet )
            result.append( q1 );
        else
            result.append( "<unset>" );
        result.append( ", vuimax: " );
        if( vuimaxESet )
            result.append( vuimax );
        else
            result.append( "<unset>" );
        result.append( ", vuimin: " );
        if( vuiminESet )
            result.append( vuimin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //UnderexcLim2SimplifiedImpl
