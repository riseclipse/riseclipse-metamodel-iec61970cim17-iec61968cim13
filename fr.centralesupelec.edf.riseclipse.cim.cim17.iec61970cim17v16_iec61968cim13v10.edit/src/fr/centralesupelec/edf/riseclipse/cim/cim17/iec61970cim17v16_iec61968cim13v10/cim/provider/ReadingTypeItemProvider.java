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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReadingTypeItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadingTypeItemProvider( AdapterFactory adapterFactory ) {
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

            addAccumulationPropertyDescriptor( object );
            addAggregatePropertyDescriptor( object );
            addCommodityPropertyDescriptor( object );
            addConsumptionTierPropertyDescriptor( object );
            addCppPropertyDescriptor( object );
            addCurrencyPropertyDescriptor( object );
            addFlowDirectionPropertyDescriptor( object );
            addMacroPeriodPropertyDescriptor( object );
            addMeasurementKindPropertyDescriptor( object );
            addMeasuringPeriodPropertyDescriptor( object );
            addMultiplierPropertyDescriptor( object );
            addPhasesPropertyDescriptor( object );
            addTouPropertyDescriptor( object );
            addUnitPropertyDescriptor( object );
            addIntervalBlocksPropertyDescriptor( object );
            addChannelPropertyDescriptor( object );
            addConsumptionTariffIntervalsPropertyDescriptor( object );
            addMetrologyRequirementsPropertyDescriptor( object );
            addPendingCalculationPropertyDescriptor( object );
            addReadingsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Accumulation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAccumulationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_accumulation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_accumulation_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Accumulation(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Aggregate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAggregatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_aggregate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_aggregate_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Aggregate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Commodity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCommodityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_commodity_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_commodity_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Commodity(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Consumption Tier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumptionTierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_consumptionTier_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_consumptionTier_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_ConsumptionTier(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_cpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_cpp_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Cpp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Currency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_currency_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_currency_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Currency(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flow Direction feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlowDirectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_flowDirection_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_flowDirection_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_FlowDirection(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Macro Period feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMacroPeriodPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_macroPeriod_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_macroPeriod_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_MacroPeriod(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Measurement Kind feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementKindPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_measurementKind_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_measurementKind_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_MeasurementKind(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Measuring Period feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasuringPeriodPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_measuringPeriod_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_measuringPeriod_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_MeasuringPeriod(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Multiplier feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMultiplierPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_multiplier_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_multiplier_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Multiplier(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Phases feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPhasesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_phases_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_phases_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Phases(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tou feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTouPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_tou_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_tou_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Tou(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_unit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_unit_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Unit(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Interval Blocks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIntervalBlocksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_IntervalBlocks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_IntervalBlocks_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_IntervalBlocks(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Channel feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChannelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_Channel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_Channel_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Channel(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Consumption Tariff Intervals feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConsumptionTariffIntervalsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ReadingType_ConsumptionTariffIntervals_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_ConsumptionTariffIntervals_feature",
                        "_UI_ReadingType_type" ),
                CimPackage.eINSTANCE.getReadingType_ConsumptionTariffIntervals(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Metrology Requirements feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMetrologyRequirementsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ReadingType_MetrologyRequirements_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_MetrologyRequirements_feature",
                        "_UI_ReadingType_type" ),
                CimPackage.eINSTANCE.getReadingType_MetrologyRequirements(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pending Calculation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPendingCalculationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_PendingCalculation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_PendingCalculation_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_PendingCalculation(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Readings feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReadingsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ReadingType_Readings_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ReadingType_Readings_feature",
                                "_UI_ReadingType_type" ),
                        CimPackage.eINSTANCE.getReadingType_Readings(), true, false, true, null, null, null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( CimPackage.eINSTANCE.getReadingType_Argument() );
            childrenFeatures.add( CimPackage.eINSTANCE.getReadingType_Interharmonic() );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns ReadingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ReadingType" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ReadingType ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ReadingType_type" )
                : getString( "_UI_ReadingType_type" ) + " " + label;
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

        switch( notification.getFeatureID( ReadingType.class ) ) {
        case CimPackage.READING_TYPE__ACCUMULATION:
        case CimPackage.READING_TYPE__AGGREGATE:
        case CimPackage.READING_TYPE__COMMODITY:
        case CimPackage.READING_TYPE__CONSUMPTION_TIER:
        case CimPackage.READING_TYPE__CPP:
        case CimPackage.READING_TYPE__CURRENCY:
        case CimPackage.READING_TYPE__FLOW_DIRECTION:
        case CimPackage.READING_TYPE__MACRO_PERIOD:
        case CimPackage.READING_TYPE__MEASUREMENT_KIND:
        case CimPackage.READING_TYPE__MEASURING_PERIOD:
        case CimPackage.READING_TYPE__MULTIPLIER:
        case CimPackage.READING_TYPE__PHASES:
        case CimPackage.READING_TYPE__TOU:
        case CimPackage.READING_TYPE__UNIT:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.READING_TYPE__ARGUMENT:
        case CimPackage.READING_TYPE__INTERHARMONIC:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
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

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getReadingType_Argument(),
                CimFactory.eINSTANCE.createRationalNumber() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getReadingType_Interharmonic(),
                CimFactory.eINSTANCE.createReadingInterharmonic() ) );
    }

}
