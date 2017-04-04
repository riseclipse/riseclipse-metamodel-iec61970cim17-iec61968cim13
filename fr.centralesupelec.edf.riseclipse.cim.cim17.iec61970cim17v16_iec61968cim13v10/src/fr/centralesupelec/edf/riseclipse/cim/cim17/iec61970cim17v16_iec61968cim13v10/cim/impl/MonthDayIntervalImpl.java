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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MonthDayInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Month Day Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MonthDayIntervalImpl#getEnd <em>End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MonthDayIntervalImpl#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonthDayIntervalImpl extends MinimalEObjectImpl.Container implements MonthDayInterval {
    /**
     * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected static final String END_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnd()
     * @generated
     * @ordered
     */
    protected String end = END_EDEFAULT;

    /**
     * This is true if the End attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endESet;

    /**
     * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected static final String START_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected String start = START_EDEFAULT;

    /**
     * This is true if the Start attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MonthDayIntervalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMonthDayInterval();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEnd() {
        return end;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnd( String newEnd ) {
        String oldEnd = end;
        end = newEnd;
        boolean oldEndESet = endESet;
        endESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MONTH_DAY_INTERVAL__END, oldEnd, end, !oldEndESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnd() {
        String oldEnd = end;
        boolean oldEndESet = endESet;
        end = END_EDEFAULT;
        endESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MONTH_DAY_INTERVAL__END, oldEnd, END_EDEFAULT, oldEndESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnd() {
        return endESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getStart() {
        return start;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStart( String newStart ) {
        String oldStart = start;
        start = newStart;
        boolean oldStartESet = startESet;
        startESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MONTH_DAY_INTERVAL__START, oldStart, start, !oldStartESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStart() {
        String oldStart = start;
        boolean oldStartESet = startESet;
        start = START_EDEFAULT;
        startESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MONTH_DAY_INTERVAL__START, oldStart, START_EDEFAULT, oldStartESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStart() {
        return startESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.MONTH_DAY_INTERVAL__END:
            return getEnd();
        case CimPackage.MONTH_DAY_INTERVAL__START:
            return getStart();
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
        case CimPackage.MONTH_DAY_INTERVAL__END:
            setEnd( ( String ) newValue );
            return;
        case CimPackage.MONTH_DAY_INTERVAL__START:
            setStart( ( String ) newValue );
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
        case CimPackage.MONTH_DAY_INTERVAL__END:
            unsetEnd();
            return;
        case CimPackage.MONTH_DAY_INTERVAL__START:
            unsetStart();
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
        case CimPackage.MONTH_DAY_INTERVAL__END:
            return isSetEnd();
        case CimPackage.MONTH_DAY_INTERVAL__START:
            return isSetStart();
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
        result.append( " (end: " );
        if( endESet )
            result.append( end );
        else
            result.append( "<unset>" );
        result.append( ", start: " );
        if( startESet )
            result.append( start );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MonthDayIntervalImpl
