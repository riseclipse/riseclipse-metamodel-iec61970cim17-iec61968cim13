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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerTransformerItemProvider extends ConductingEquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerTransformerItemProvider( AdapterFactory adapterFactory ) {
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

            addBeforeShCircuitHighestOperatingCurrentPropertyDescriptor( object );
            addBeforeShCircuitHighestOperatingVoltagePropertyDescriptor( object );
            addBeforeShortCircuitAnglePfPropertyDescriptor( object );
            addHighSideMinOperatingUPropertyDescriptor( object );
            addIsPartOfGeneratorUnitPropertyDescriptor( object );
            addOperationalValuesConsideredPropertyDescriptor( object );
            addVectorGroupPropertyDescriptor( object );
            addPowerTransformerEndPropertyDescriptor( object );
            addTransformerTanksPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Before Sh Circuit Highest Operating Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBeforeShCircuitHighestOperatingCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformer_beforeShCircuitHighestOperatingCurrent_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_PowerTransformer_beforeShCircuitHighestOperatingCurrent_feature",
                        "_UI_PowerTransformer_type" ),
                CimPackage.eINSTANCE.getPowerTransformer_BeforeShCircuitHighestOperatingCurrent(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Before Sh Circuit Highest Operating Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBeforeShCircuitHighestOperatingVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformer_beforeShCircuitHighestOperatingVoltage_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_PowerTransformer_beforeShCircuitHighestOperatingVoltage_feature",
                        "_UI_PowerTransformer_type" ),
                CimPackage.eINSTANCE.getPowerTransformer_BeforeShCircuitHighestOperatingVoltage(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Before Short Circuit Angle Pf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBeforeShortCircuitAnglePfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerTransformer_beforeShortCircuitAnglePf_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerTransformer_beforeShortCircuitAnglePf_feature", "_UI_PowerTransformer_type" ),
                        CimPackage.eINSTANCE.getPowerTransformer_BeforeShortCircuitAnglePf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the High Side Min Operating U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHighSideMinOperatingUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformer_highSideMinOperatingU_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformer_highSideMinOperatingU_feature",
                        "_UI_PowerTransformer_type" ),
                CimPackage.eINSTANCE.getPowerTransformer_HighSideMinOperatingU(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Part Of Generator Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsPartOfGeneratorUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformer_isPartOfGeneratorUnit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformer_isPartOfGeneratorUnit_feature",
                        "_UI_PowerTransformer_type" ),
                CimPackage.eINSTANCE.getPowerTransformer_IsPartOfGeneratorUnit(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Operational Values Considered feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationalValuesConsideredPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformer_operationalValuesConsidered_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_PowerTransformer_operationalValuesConsidered_feature", "_UI_PowerTransformer_type" ),
                CimPackage.eINSTANCE.getPowerTransformer_OperationalValuesConsidered(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vector Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVectorGroupPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PowerTransformer_vectorGroup_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformer_vectorGroup_feature",
                                "_UI_PowerTransformer_type" ),
                        CimPackage.eINSTANCE.getPowerTransformer_VectorGroup(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Power Transformer End feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerTransformerEndPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformer_PowerTransformerEnd_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformer_PowerTransformerEnd_feature",
                        "_UI_PowerTransformer_type" ),
                CimPackage.eINSTANCE.getPowerTransformer_PowerTransformerEnd(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Transformer Tanks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransformerTanksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_PowerTransformer_TransformerTanks_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerTransformer_TransformerTanks_feature",
                        "_UI_PowerTransformer_type" ),
                CimPackage.eINSTANCE.getPowerTransformer_TransformerTanks(), true, false, true, null, null, null ) );
    }

    /**
     * This returns PowerTransformer.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PowerTransformer" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PowerTransformer ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PowerTransformer_type" )
                : getString( "_UI_PowerTransformer_type" ) + " " + label;
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

        switch( notification.getFeatureID( PowerTransformer.class ) ) {
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
        case CimPackage.POWER_TRANSFORMER__VECTOR_GROUP:
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
