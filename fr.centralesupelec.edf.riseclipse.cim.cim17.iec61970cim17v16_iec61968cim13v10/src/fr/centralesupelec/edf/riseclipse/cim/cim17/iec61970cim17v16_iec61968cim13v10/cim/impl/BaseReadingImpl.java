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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQuality;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Base Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseReadingImpl#getReportedDateTime <em>Reported Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseReadingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseReadingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseReadingImpl#getTimePeriod <em>Time Period</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BaseReadingImpl#getReadingQualities <em>Reading Qualities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseReadingImpl extends MeasurementValueImpl implements BaseReading {
    /**
     * The default value of the '{@link #getReportedDateTime() <em>Reported Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date REPORTED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReportedDateTime() <em>Reported Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportedDateTime()
     * @generated
     * @ordered
     */
    protected Date reportedDateTime = REPORTED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Reported Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportedDateTimeESet;

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * This is true if the Source attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sourceESet;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * The cached value of the '{@link #getTimePeriod() <em>Time Period</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimePeriod()
     * @generated
     * @ordered
     */
    protected DateTimeInterval timePeriod;

    /**
     * This is true if the Time Period containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timePeriodESet;

    /**
     * The cached value of the '{@link #getReadingQualities() <em>Reading Qualities</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadingQualities()
     * @generated
     * @ordered
     */
    protected EList< ReadingQuality > readingQualities;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BaseReadingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBaseReading();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getReportedDateTime() {
        return reportedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReportedDateTime( Date newReportedDateTime ) {
        Date oldReportedDateTime = reportedDateTime;
        reportedDateTime = newReportedDateTime;
        boolean oldReportedDateTimeESet = reportedDateTimeESet;
        reportedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BASE_READING__REPORTED_DATE_TIME,
                    oldReportedDateTime, reportedDateTime, !oldReportedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReportedDateTime() {
        Date oldReportedDateTime = reportedDateTime;
        boolean oldReportedDateTimeESet = reportedDateTimeESet;
        reportedDateTime = REPORTED_DATE_TIME_EDEFAULT;
        reportedDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BASE_READING__REPORTED_DATE_TIME,
                    oldReportedDateTime, REPORTED_DATE_TIME_EDEFAULT, oldReportedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportedDateTime() {
        return reportedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSource( String newSource ) {
        String oldSource = source;
        source = newSource;
        boolean oldSourceESet = sourceESet;
        sourceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BASE_READING__SOURCE, oldSource, source, !oldSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSource() {
        String oldSource = source;
        boolean oldSourceESet = sourceESet;
        source = SOURCE_EDEFAULT;
        sourceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BASE_READING__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSource() {
        return sourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( String newValue ) {
        String oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BASE_READING__VALUE, oldValue, value, !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        String oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BASE_READING__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimePeriod( DateTimeInterval newTimePeriod, NotificationChain msgs ) {
        DateTimeInterval oldTimePeriod = timePeriod;
        timePeriod = newTimePeriod;
        boolean oldTimePeriodESet = timePeriodESet;
        timePeriodESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BASE_READING__TIME_PERIOD, oldTimePeriod, newTimePeriod, !oldTimePeriodESet );
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
    public void setTimePeriod( DateTimeInterval newTimePeriod ) {
        if( newTimePeriod != timePeriod ) {
            NotificationChain msgs = null;
            if( timePeriod != null ) msgs = ( ( InternalEObject ) timePeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.BASE_READING__TIME_PERIOD, null, msgs );
            if( newTimePeriod != null ) msgs = ( ( InternalEObject ) newTimePeriod ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.BASE_READING__TIME_PERIOD, null, msgs );
            msgs = basicSetTimePeriod( newTimePeriod, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTimePeriodESet = timePeriodESet;
            timePeriodESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.BASE_READING__TIME_PERIOD, newTimePeriod, newTimePeriod, !oldTimePeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTimePeriod( NotificationChain msgs ) {
        DateTimeInterval oldTimePeriod = timePeriod;
        timePeriod = null;
        boolean oldTimePeriodESet = timePeriodESet;
        timePeriodESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BASE_READING__TIME_PERIOD, oldTimePeriod, null, oldTimePeriodESet );
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
    public void unsetTimePeriod() {
        if( timePeriod != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) timePeriod ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.BASE_READING__TIME_PERIOD, null, msgs );
            msgs = basicUnsetTimePeriod( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTimePeriodESet = timePeriodESet;
            timePeriodESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BASE_READING__TIME_PERIOD, null, null, oldTimePeriodESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimePeriod() {
        return timePeriodESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ReadingQuality > getReadingQualities() {
        if( readingQualities == null ) {
            readingQualities = new EObjectWithInverseResolvingEList.Unsettable< ReadingQuality >( ReadingQuality.class,
                    this, CimPackage.BASE_READING__READING_QUALITIES, CimPackage.READING_QUALITY__READING );
        }
        return readingQualities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadingQualities() {
        if( readingQualities != null ) ( ( InternalEList.Unsettable< ? > ) readingQualities ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadingQualities() {
        return readingQualities != null && ( ( InternalEList.Unsettable< ? > ) readingQualities ).isSet();
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
        case CimPackage.BASE_READING__READING_QUALITIES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getReadingQualities() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.BASE_READING__TIME_PERIOD:
            return basicUnsetTimePeriod( msgs );
        case CimPackage.BASE_READING__READING_QUALITIES:
            return ( ( InternalEList< ? > ) getReadingQualities() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.BASE_READING__REPORTED_DATE_TIME:
            return getReportedDateTime();
        case CimPackage.BASE_READING__SOURCE:
            return getSource();
        case CimPackage.BASE_READING__VALUE:
            return getValue();
        case CimPackage.BASE_READING__TIME_PERIOD:
            return getTimePeriod();
        case CimPackage.BASE_READING__READING_QUALITIES:
            return getReadingQualities();
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
        case CimPackage.BASE_READING__REPORTED_DATE_TIME:
            setReportedDateTime( ( Date ) newValue );
            return;
        case CimPackage.BASE_READING__SOURCE:
            setSource( ( String ) newValue );
            return;
        case CimPackage.BASE_READING__VALUE:
            setValue( ( String ) newValue );
            return;
        case CimPackage.BASE_READING__TIME_PERIOD:
            setTimePeriod( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.BASE_READING__READING_QUALITIES:
            getReadingQualities().clear();
            getReadingQualities().addAll( ( Collection< ? extends ReadingQuality > ) newValue );
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
        case CimPackage.BASE_READING__REPORTED_DATE_TIME:
            unsetReportedDateTime();
            return;
        case CimPackage.BASE_READING__SOURCE:
            unsetSource();
            return;
        case CimPackage.BASE_READING__VALUE:
            unsetValue();
            return;
        case CimPackage.BASE_READING__TIME_PERIOD:
            unsetTimePeriod();
            return;
        case CimPackage.BASE_READING__READING_QUALITIES:
            unsetReadingQualities();
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
        case CimPackage.BASE_READING__REPORTED_DATE_TIME:
            return isSetReportedDateTime();
        case CimPackage.BASE_READING__SOURCE:
            return isSetSource();
        case CimPackage.BASE_READING__VALUE:
            return isSetValue();
        case CimPackage.BASE_READING__TIME_PERIOD:
            return isSetTimePeriod();
        case CimPackage.BASE_READING__READING_QUALITIES:
            return isSetReadingQualities();
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
        result.append( " (reportedDateTime: " );
        if( reportedDateTimeESet )
            result.append( reportedDateTime );
        else
            result.append( "<unset>" );
        result.append( ", source: " );
        if( sourceESet )
            result.append( source );
        else
            result.append( "<unset>" );
        result.append( ", value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BaseReadingImpl
