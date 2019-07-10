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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurementValueItemProvider extends IOPointItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasurementValueItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addSensorAccuracyPropertyDescriptor( object );
            addTimeStampPropertyDescriptor( object );
            addCalculationMethodHierarchyPropertyDescriptor( object );
            addMeasurementValueSourcePropertyDescriptor( object );
            addProcedureDataSetPropertyDescriptor( object );
            addRemoteSourcePropertyDescriptor( object );
            addMeasurementValueQualityPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Sensor Accuracy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSensorAccuracyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_MeasurementValue_sensorAccuracy_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_MeasurementValue_sensorAccuracy_feature",
                        "_UI_MeasurementValue_type" ),
                CimPackage.eINSTANCE.getMeasurementValue_SensorAccuracy(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Time Stamp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTimeStampPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeasurementValue_timeStamp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeasurementValue_timeStamp_feature",
                                "_UI_MeasurementValue_type" ),
                        CimPackage.eINSTANCE.getMeasurementValue_TimeStamp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Calculation Method Hierarchy feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCalculationMethodHierarchyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_MeasurementValue_CalculationMethodHierarchy_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_MeasurementValue_CalculationMethodHierarchy_feature", "_UI_MeasurementValue_type" ),
                CimPackage.eINSTANCE.getMeasurementValue_CalculationMethodHierarchy(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Measurement Value Source feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementValueSourcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeasurementValue_MeasurementValueSource_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_MeasurementValue_MeasurementValueSource_feature", "_UI_MeasurementValue_type" ),
                        CimPackage.eINSTANCE.getMeasurementValue_MeasurementValueSource(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the Procedure Data Set feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addProcedureDataSetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_MeasurementValue_ProcedureDataSet_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_MeasurementValue_ProcedureDataSet_feature",
                        "_UI_MeasurementValue_type" ),
                CimPackage.eINSTANCE.getMeasurementValue_ProcedureDataSet(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Remote Source feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRemoteSourcePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeasurementValue_RemoteSource_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_MeasurementValue_RemoteSource_feature",
                                "_UI_MeasurementValue_type" ),
                        CimPackage.eINSTANCE.getMeasurementValue_RemoteSource(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Measurement Value Quality feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementValueQualityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_MeasurementValue_MeasurementValueQuality_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_MeasurementValue_MeasurementValueQuality_feature", "_UI_MeasurementValue_type" ),
                        CimPackage.eINSTANCE.getMeasurementValue_MeasurementValueQuality(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This returns MeasurementValue.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/MeasurementValue" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( MeasurementValue ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_MeasurementValue_type" )
                : getString( "_UI_MeasurementValue_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( MeasurementValue.class ) ) {
        case CimPackage.MEASUREMENT_VALUE__SENSOR_ACCURACY:
        case CimPackage.MEASUREMENT_VALUE__TIME_STAMP:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
