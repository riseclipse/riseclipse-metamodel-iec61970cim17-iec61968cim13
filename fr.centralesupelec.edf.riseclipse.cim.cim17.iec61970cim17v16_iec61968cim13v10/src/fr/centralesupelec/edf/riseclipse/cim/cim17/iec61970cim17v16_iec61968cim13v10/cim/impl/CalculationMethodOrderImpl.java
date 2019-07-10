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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StatisticalCalculation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculation Method Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CalculationMethodOrderImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CalculationMethodOrderImpl#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CalculationMethodOrderImpl#getStatisicalCalculation <em>Statisical Calculation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculationMethodOrderImpl extends CimObjectWithIDImpl implements CalculationMethodOrder {
    /**
     * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrder()
     * @generated
     * @ordered
     */
    protected static final Integer ORDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrder()
     * @generated
     * @ordered
     */
    protected Integer order = ORDER_EDEFAULT;

    /**
     * This is true if the Order attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean orderESet;

    /**
     * The cached value of the '{@link #getCalculationMethodHierarchy() <em>Calculation Method Hierarchy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationMethodHierarchy()
     * @generated
     * @ordered
     */
    protected CalculationMethodHierarchy calculationMethodHierarchy;

    /**
     * This is true if the Calculation Method Hierarchy reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean calculationMethodHierarchyESet;

    /**
     * The cached value of the '{@link #getStatisicalCalculation() <em>Statisical Calculation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatisicalCalculation()
     * @generated
     * @ordered
     */
    protected StatisticalCalculation statisicalCalculation;

    /**
     * This is true if the Statisical Calculation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statisicalCalculationESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CalculationMethodOrderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCalculationMethodOrder();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getOrder() {
        return order;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOrder( Integer newOrder ) {
        Integer oldOrder = order;
        order = newOrder;
        boolean oldOrderESet = orderESet;
        orderESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CALCULATION_METHOD_ORDER__ORDER, oldOrder, order, !oldOrderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOrder() {
        Integer oldOrder = order;
        boolean oldOrderESet = orderESet;
        order = ORDER_EDEFAULT;
        orderESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CALCULATION_METHOD_ORDER__ORDER, oldOrder, ORDER_EDEFAULT, oldOrderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOrder() {
        return orderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CalculationMethodHierarchy getCalculationMethodHierarchy() {
        return calculationMethodHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCalculationMethodHierarchy(
            CalculationMethodHierarchy newCalculationMethodHierarchy, NotificationChain msgs ) {
        CalculationMethodHierarchy oldCalculationMethodHierarchy = calculationMethodHierarchy;
        calculationMethodHierarchy = newCalculationMethodHierarchy;
        boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
        calculationMethodHierarchyESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY, oldCalculationMethodHierarchy,
                    newCalculationMethodHierarchy, !oldCalculationMethodHierarchyESet );
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
    public void setCalculationMethodHierarchy( CalculationMethodHierarchy newCalculationMethodHierarchy ) {
        if( newCalculationMethodHierarchy != calculationMethodHierarchy ) {
            NotificationChain msgs = null;
            if( calculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER,
                        CalculationMethodHierarchy.class, msgs );
            if( newCalculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) newCalculationMethodHierarchy ).eInverseAdd( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER,
                        CalculationMethodHierarchy.class, msgs );
            msgs = basicSetCalculationMethodHierarchy( newCalculationMethodHierarchy, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
            calculationMethodHierarchyESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY, newCalculationMethodHierarchy,
                    newCalculationMethodHierarchy, !oldCalculationMethodHierarchyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCalculationMethodHierarchy( NotificationChain msgs ) {
        CalculationMethodHierarchy oldCalculationMethodHierarchy = calculationMethodHierarchy;
        calculationMethodHierarchy = null;
        boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
        calculationMethodHierarchyESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY, oldCalculationMethodHierarchy,
                    null, oldCalculationMethodHierarchyESet );
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
    public void unsetCalculationMethodHierarchy() {
        if( calculationMethodHierarchy != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER, CalculationMethodHierarchy.class,
                    msgs );
            msgs = basicUnsetCalculationMethodHierarchy( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
            calculationMethodHierarchyESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY, null, null,
                    oldCalculationMethodHierarchyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationMethodHierarchy() {
        return calculationMethodHierarchyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StatisticalCalculation getStatisicalCalculation() {
        return statisicalCalculation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatisicalCalculation( StatisticalCalculation newStatisicalCalculation,
            NotificationChain msgs ) {
        StatisticalCalculation oldStatisicalCalculation = statisicalCalculation;
        statisicalCalculation = newStatisicalCalculation;
        boolean oldStatisicalCalculationESet = statisicalCalculationESet;
        statisicalCalculationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION, oldStatisicalCalculation,
                    newStatisicalCalculation, !oldStatisicalCalculationESet );
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
    public void setStatisicalCalculation( StatisticalCalculation newStatisicalCalculation ) {
        if( newStatisicalCalculation != statisicalCalculation ) {
            NotificationChain msgs = null;
            if( statisicalCalculation != null )
                msgs = ( ( InternalEObject ) statisicalCalculation ).eInverseRemove( this,
                        CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER, StatisticalCalculation.class,
                        msgs );
            if( newStatisicalCalculation != null )
                msgs = ( ( InternalEObject ) newStatisicalCalculation ).eInverseAdd( this,
                        CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER, StatisticalCalculation.class,
                        msgs );
            msgs = basicSetStatisicalCalculation( newStatisicalCalculation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatisicalCalculationESet = statisicalCalculationESet;
            statisicalCalculationESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION, newStatisicalCalculation,
                    newStatisicalCalculation, !oldStatisicalCalculationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatisicalCalculation( NotificationChain msgs ) {
        StatisticalCalculation oldStatisicalCalculation = statisicalCalculation;
        statisicalCalculation = null;
        boolean oldStatisicalCalculationESet = statisicalCalculationESet;
        statisicalCalculationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION, oldStatisicalCalculation, null,
                    oldStatisicalCalculationESet );
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
    public void unsetStatisicalCalculation() {
        if( statisicalCalculation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) statisicalCalculation ).eInverseRemove( this,
                    CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER, StatisticalCalculation.class, msgs );
            msgs = basicUnsetStatisicalCalculation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatisicalCalculationESet = statisicalCalculationESet;
            statisicalCalculationESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION, null, null,
                    oldStatisicalCalculationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatisicalCalculation() {
        return statisicalCalculationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY:
            if( calculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER,
                        CalculationMethodHierarchy.class, msgs );
            return basicSetCalculationMethodHierarchy( ( CalculationMethodHierarchy ) otherEnd, msgs );
        case CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION:
            if( statisicalCalculation != null )
                msgs = ( ( InternalEObject ) statisicalCalculation ).eInverseRemove( this,
                        CimPackage.STATISTICAL_CALCULATION__CALCULATION_METHOD_ORDER, StatisticalCalculation.class,
                        msgs );
            return basicSetStatisicalCalculation( ( StatisticalCalculation ) otherEnd, msgs );
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
        case CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY:
            return basicUnsetCalculationMethodHierarchy( msgs );
        case CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION:
            return basicUnsetStatisicalCalculation( msgs );
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
        case CimPackage.CALCULATION_METHOD_ORDER__ORDER:
            return getOrder();
        case CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY:
            return getCalculationMethodHierarchy();
        case CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION:
            return getStatisicalCalculation();
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
        case CimPackage.CALCULATION_METHOD_ORDER__ORDER:
            setOrder( ( Integer ) newValue );
            return;
        case CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY:
            setCalculationMethodHierarchy( ( CalculationMethodHierarchy ) newValue );
            return;
        case CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION:
            setStatisicalCalculation( ( StatisticalCalculation ) newValue );
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
        case CimPackage.CALCULATION_METHOD_ORDER__ORDER:
            unsetOrder();
            return;
        case CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY:
            unsetCalculationMethodHierarchy();
            return;
        case CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION:
            unsetStatisicalCalculation();
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
        case CimPackage.CALCULATION_METHOD_ORDER__ORDER:
            return isSetOrder();
        case CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY:
            return isSetCalculationMethodHierarchy();
        case CimPackage.CALCULATION_METHOD_ORDER__STATISICAL_CALCULATION:
            return isSetStatisicalCalculation();
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
        result.append( " (order: " );
        if( orderESet )
            result.append( order );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CalculationMethodOrderImpl
