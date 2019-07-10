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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Specimen} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecimenItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecimenItemProvider( AdapterFactory adapterFactory ) {
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

            addAmbientTemperatureAtSamplingPropertyDescriptor( object );
            addHumidityAtSamplingPropertyDescriptor( object );
            addSpecimenIDPropertyDescriptor( object );
            addSpecimenSampleDateTimePropertyDescriptor( object );
            addSpecimenToLabDateTimePropertyDescriptor( object );
            addLabTestDataSetPropertyDescriptor( object );
            addAssetTestSampleTakerPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ambient Temperature At Sampling feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAmbientTemperatureAtSamplingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_Specimen_ambientTemperatureAtSampling_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_Specimen_ambientTemperatureAtSampling_feature",
                        "_UI_Specimen_type" ),
                CimPackage.eINSTANCE.getSpecimen_AmbientTemperatureAtSampling(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Humidity At Sampling feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHumidityAtSamplingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Specimen_humidityAtSampling_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Specimen_humidityAtSampling_feature",
                                "_UI_Specimen_type" ),
                        CimPackage.eINSTANCE.getSpecimen_HumidityAtSampling(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Specimen ID feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpecimenIDPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Specimen_specimenID_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Specimen_specimenID_feature",
                                "_UI_Specimen_type" ),
                        CimPackage.eINSTANCE.getSpecimen_SpecimenID(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Specimen Sample Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpecimenSampleDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Specimen_specimenSampleDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Specimen_specimenSampleDateTime_feature",
                                "_UI_Specimen_type" ),
                        CimPackage.eINSTANCE.getSpecimen_SpecimenSampleDateTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Specimen To Lab Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpecimenToLabDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Specimen_specimenToLabDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Specimen_specimenToLabDateTime_feature",
                                "_UI_Specimen_type" ),
                        CimPackage.eINSTANCE.getSpecimen_SpecimenToLabDateTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lab Test Data Set feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLabTestDataSetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Specimen_LabTestDataSet_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Specimen_LabTestDataSet_feature",
                                "_UI_Specimen_type" ),
                        CimPackage.eINSTANCE.getSpecimen_LabTestDataSet(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset Test Sample Taker feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetTestSampleTakerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_Specimen_AssetTestSampleTaker_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Specimen_AssetTestSampleTaker_feature",
                                "_UI_Specimen_type" ),
                        CimPackage.eINSTANCE.getSpecimen_AssetTestSampleTaker(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns Specimen.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Specimen" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Specimen ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Specimen_type" )
                : getString( "_UI_Specimen_type" ) + " " + label;
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

        switch( notification.getFeatureID( Specimen.class ) ) {
        case CimPackage.SPECIMEN__AMBIENT_TEMPERATURE_AT_SAMPLING:
        case CimPackage.SPECIMEN__HUMIDITY_AT_SAMPLING:
        case CimPackage.SPECIMEN__SPECIMEN_ID:
        case CimPackage.SPECIMEN__SPECIMEN_SAMPLE_DATE_TIME:
        case CimPackage.SPECIMEN__SPECIMEN_TO_LAB_DATE_TIME:
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
